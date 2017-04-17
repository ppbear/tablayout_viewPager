package com.wizarpos.cardinfolink.tablayout_viewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity{

    private ArrayList<Fragment> datas;
    private ViewPager viewpager;
    private TabLayout tablayout;
    private SendAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datas = new ArrayList<>();
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment3());
        datas.add(new PagerFragment1());
        datas.add(new PagerFragment2());
        datas.add(new PagerFragment3());
        viewpager = (ViewPager) findViewById(R.id.viewPager);//绑定viewpager
        tablayout = (TabLayout) findViewById(R.id.tablayout);//绑定tablayout
        adapter = new SendAdapter(getSupportFragmentManager(), datas);//初始化fragment类型adapter,datas为adapter构造函数参数
        viewpager.setAdapter(adapter);//将adapter加入viewpager中
        tablayout.setTabTextColors(Color.BLUE, Color.GREEN);//加入title选择和被选择的颜色,前面为未点击的颜色,后面为点击后的颜色
        tablayout.setupWithViewPager(viewpager);//将tablayout与viewpager建立关系
        tablayout.setSelectedTabIndicatorHeight(10);
        tablayout.setSelectedTabIndicatorColor(Color.RED);
    }

    class SendAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> datas;//因为要用将fragment加入到viewpager之中,所以内容为fragment类型的集合

        String title1 = "拨号";
        String title2 = "最近通话";
        String title3 = "联系人";
        String[] titles = {title1, title2, title3,title1, title2, title3,title1, title2, title3,title1, title2, title3,title1, title2, title3,title1, title2, title3,title1, title2, title3, title3,title1, title2, title3, title3,title1, title2, title3};//设置底部tablayoutout显示文字

        public SendAdapter(FragmentManager fm, ArrayList<Fragment> datas) {//设置构造函数,将fragment传入到viewpager中
            super(fm);
            this.datas = datas;
        }

        @Override
        public Fragment getItem(int position) {
            return datas.get(position);
        }

        @Override
        public int getCount() {
            return datas.size();
        }

        @Override//tablayout和viewpager结合之后,创建底部title使用的方法
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}
