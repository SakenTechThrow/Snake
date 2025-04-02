package com.itproger;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//import javafx.scene.text.Text;


import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class ProjectTwo extends Application {

    private static final int CELL_SIZE = 20;
    private static final int GRID_SIZE = 20;
    private LinkedList<Point> snake;
    private Direction direction = Direction.RIGHT;
    private Point food;
    private Random random = new Random();
    //private Text text = new Text();
    private Canvas canvas;
    private GraphicsContext gc;

    private int score = 0;
    private long speed = 100_000_000; // Начальная скорость 1e9
    private boolean just = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        canvas = new Canvas(CELL_SIZE * GRID_SIZE, CELL_SIZE * GRID_SIZE);
        gc = canvas.getGraphicsContext2D();

        snake = new LinkedList<>();
        snake.add(new Point(GRID_SIZE / 2 + 2, GRID_SIZE / 2)); // Начальная позиция головы
        snake.add(new Point(GRID_SIZE / 2 + 1, GRID_SIZE / 2)); // Второй сегмент
        snake.add(new Point(GRID_SIZE / 2, GRID_SIZE / 2));     // Третий сегмент
        spawnFood();

        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, CELL_SIZE * GRID_SIZE, CELL_SIZE * GRID_SIZE);
        scene.setOnKeyPressed(event -> handleKeyPress(event.getCode()));

        //root.getChildren().add(text);

        primaryStage.setTitle("Snake Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        //AnimationTimer для обновления игры
        new AnimationTimer() {
            long lastUpdate = 0;

            @Override
            public void handle(long now) {
                if (now - lastUpdate >= speed) { // Обновление каждые 100 миллисекунд
                    update();
                    draw();
                    lastUpdate = now;
                }
            }
        }.start();
    }

    private void handleKeyPress(KeyCode code) {
        Direction newDirection = getDirectionFromKeyCode(code);
        if (newDirection != null && !newDirection.isOpposite(direction)) {
            direction = newDirection;
        }
    }

    private Direction getDirectionFromKeyCode(KeyCode code) {
        switch (code) {
            case W:
                return Direction.UP;
            case S:
                return Direction.DOWN;
            case A:
                return Direction.LEFT;
            case D:
                return Direction.RIGHT;
            default:
                return null;
        }
    }

    private void update() {
        // Обновление положения змеи
        Point head = snake.getFirst();
        Point newHead = new Point(head.x, head.y);

        switch (direction) {
            case UP:
                newHead.y = (newHead.y - 1 + GRID_SIZE) % GRID_SIZE;
                break;
            case DOWN:
                newHead.y = (newHead.y + 1) % GRID_SIZE;
                break;
            case LEFT:
                newHead.x = (newHead.x - 1 + GRID_SIZE) % GRID_SIZE;
                break;
            case RIGHT:
                newHead.x = (newHead.x + 1) % GRID_SIZE;
                break;
        }

        // Проверка столкновения с самой собой
        if (snake.contains(newHead)) {
            gameOver();
            just = true;
            return;
        }

        snake.addFirst(newHead);

        // Проверка съедания еды
        checkInteractionWithSpecialObject();

        if (!newHead.equals(food)) {
            snake.removeLast();
        }
    }

    private void checkInteractionWithSpecialObject() {
        if (snake.getFirst().equals(food)) {
            // взаимодействия с новым объектом
            snake.addLast(new Point(-1, -1));
            spawnFood(); // Создаем новый объект после взаимодействия

            score++;

            if (score % 2 == 0) {
                speed *= 0.9;
            }
        }
    }

    private void spawnFood() {
        do {
            food = new Point(random.nextInt(GRID_SIZE), random.nextInt(GRID_SIZE));
        } while (snake.contains(food));

    }

    private void draw() {
        gc.clearRect(0, 0, CELL_SIZE * GRID_SIZE, CELL_SIZE * GRID_SIZE);

        // Отрисовка фона
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, CELL_SIZE * GRID_SIZE, CELL_SIZE * GRID_SIZE);

        // Отрисовка еды
        gc.setFill(Color.YELLOW);
        gc.fillRect(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE-2, CELL_SIZE-2);


        // Отрисовка змеи
        gc.setFill(Color.YELLOW);

        gc.setFill(Color.RED);
        Point head = snake.getFirst();
        gc.fillRect(head.x * CELL_SIZE, head.y * CELL_SIZE, CELL_SIZE-2, CELL_SIZE-2);

        // gc.setFill(Color.BLUE);
        // Point head1 = snake.get(1);
        // gc.fillRect(head1.x * CELL_SIZE, head1.y * CELL_SIZE, CELL_SIZE-2, CELL_SIZE-2);

        for (Point point : snake.subList(1, snake.size())) {
            gc.setFill(Color.GREEN);
            gc.fillRect(point.x * CELL_SIZE, point.y * CELL_SIZE, CELL_SIZE-2, CELL_SIZE-2);
        }
        gc.setFill(Color.WHITE);
        gc.fillText("Score: " + score, 10, 20);
        gc.fillText("Length of Snake: " + snake.size(), 10, 40 );
        gc.fillText("Speed: " + (snake.size()*2) + " km/h",10, 60 );

    }

    private void gameOver() {
        System.out.println("Game Over! Score: " + score);
        System.exit(0);
    }
    public enum Direction {
        UP, DOWN, LEFT, RIGHT;

        // Метод для определения, является ли направление противоположным
        public boolean isOpposite(Direction other) {
            return this == UP && other == DOWN ||
                    this == DOWN && other == UP ||
                    this == LEFT && other == RIGHT ||
                    this == RIGHT && other == LEFT;
        }
    }

}
