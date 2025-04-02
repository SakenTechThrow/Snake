package com.itproger;
//
//public class Test {
//    public static void main(String[] args) {
//        Animal animal = new Animal(1);
//        Person1 person1 = new Person1("Bob");
//        outputInfo(animal);
//        outputInfo(person1);
//    }
//    public static void outputInfo(Info info){
//        info.showInfo();
//    }
//}
public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2};
        int[] num = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && index < num.length){
                    num[index] = nums[i];
                    index++;
                }
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(num[i] + " ");
        }
    }
}