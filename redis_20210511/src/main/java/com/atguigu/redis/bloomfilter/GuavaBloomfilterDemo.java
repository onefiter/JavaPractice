package com.atguigu.redis.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GuavaBloomfilterDemo {
    public static final int _1W = 10000;
    public static final int size = 100 * _1W;
    // 布隆过滤器里预计要插入多少数据
    // 误判率，它越小误判的个数也就越少（思考：是不是可以设置无限小，没有误判岂不是更好）
    // 误判越小，程序执行效率越慢，占用的内存坑位越大，使用哈希函数越多
    public static double fpp = 0.03;


    @Test
    public void bloomFilter() {
        // 创建布隆过滤器对象
        BloomFilter<Integer> filter = BloomFilter. create (Funnels.integerFunnel (), 100 );
        // 判断指定元素是否存在
        System.out.println(filter.mightContain( 1 ));
        System.out.println(filter.mightContain( 2 ));
        // 将元素添加进布隆过滤器
        filter.put( 1 );
        filter.put( 2 );
        System.out.println(filter.mightContain( 1 ));
        System. out .println(filter.mightContain( 2 ));
    }

    @Test
    public void bloomFilter2() {
        // 创建布隆过滤器对象
        BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel (), size);

        // 插入 100万样本
        for (int i = 0; i < size; i++) {
            filter.put(i);
        }

        List<Integer> listSample = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            if(filter.mightContain(i)) {
                listSample.add(i);
            }
        }

        System.out.println("存在的数量：" + listSample.size());

        // 查看误判率
        List<Integer> list = new ArrayList<>(10 * _1W);
        for (int i = size+1; i < size + 10000; i++) {
            if(filter.mightContain(i)) {
                System.out.println(i + "\t"+"被误判了。");
                list.add(i);
            }
        }

        System.out.println("误判的数量：" + list.size());
    }
}
