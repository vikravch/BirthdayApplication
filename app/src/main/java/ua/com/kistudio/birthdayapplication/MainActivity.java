package ua.com.kistudio.birthdayapplication;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private SectionPagerAdapter mFragmentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setTitleTextColor(Color.GRAY);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mFragmentsAdapter = new SectionPagerAdapter(getSupportFragmentManager(),this);

        ViewPager viewPager = (ViewPager) findViewById(R.id.vpStart);
        viewPager.setAdapter(mFragmentsAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
