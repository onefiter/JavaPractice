package com.onefiter.Object;

/**
 * author: onefiter
 * date: 2023/6/29
 */
public class StudentTest {
    public static void main(String[] args) {

        // 声明一个Student类型的数组，来存放循环创建的20个Student对象
        Student[] studentArr = new Student[20];

        // 循环20次创建20个Student对象并存入Student数组
        for (int i = 0; i < 20; i++) {

            // 创建Student对象
            Student student = new Student();

            // 给Student对象设置number属性
            student.number = i + 1;

            // 给Student对象设置state属性
            student.state = (int) (Math.random() * 10) + 1;

            // 给Student对象设置score属性
            student.score = (int) (Math.random() * 100);

            // 将Student对象存入数组
            studentArr[i] = student;

            // 判断当前Student对象的state属性是否为3
//            if (student.state == 3) {
//                student.showMyInfo();
//            }

            // 开发过程中，为了看到全部数据的情况，逐个打印
            student.showMyInfo();
        }

        // 对数组中的元素进行冒泡排序
        // 外层循环：控制『冒泡』次数
        for (int i = 0; i < 20; i++) {

            // 内层循环：负责执行『冒泡』
            // 每冒泡一次就是把当前范围最大的元素移动到最后
            // 减 i 是因为已经排序好的元素不用动
            // 减 1 是因为避免j+1找下一个元素时数组下标越界
            for (int j = 0; j < (20 - i - 1) ; j++) {

                // 将『当前学生的分数』和『下一个学生的分数』进行比较
                if (studentArr[j].score > studentArr[j+1].score) {

                    // 交换：需要借助中间变量
                    Student swap = studentArr[j];

                    studentArr[j] = studentArr[j+1];

                    studentArr[j+1] = swap;

                }

            }

        }

        // 打印分割线
        System.out.println("=================================");

        // 遍历Student数组
        for (int i = 0; i < studentArr.length; i++) {

            Student student = studentArr[i];

            student.showMyInfo();

        }

    }

}
