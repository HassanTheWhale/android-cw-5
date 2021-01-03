package site.thewhale.whalessfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.vp);
        TabLayout tl = findViewById(R.id.tl);
        tl.setupWithViewPager(vp);

        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager());
        vp.setAdapter(fragAdapter);
        vp.setCurrentItem(0, true);

        tl.getTabAt(0).setIcon(R.drawable.ic_baseline_star_24);
        tl.getTabAt(1).setIcon(R.drawable.ic_baseline_sports_kabaddi_24);
        tl.getTabAt(2).setIcon(R.drawable.ic_baseline_directions_run_24);

        Toolbar toolbar = findViewById(R.id.toolbar);

        //if you want to update the items at a later time it is recommended to keep it in a variable
        SecondaryDrawerItem item2 = new SecondaryDrawerItem().withIdentifier(1).withName("هاري بوتر").withIcon(R.drawable.ic_baseline_star_24);
        SecondaryDrawerItem item3 = new SecondaryDrawerItem().withIdentifier(2).withName("أفنجر").withIcon(R.drawable.ic_baseline_sports_kabaddi_24);
        SecondaryDrawerItem item5 = new SecondaryDrawerItem().withIdentifier(3).withName("إكس مان").withIcon(R.drawable.ic_baseline_directions_run_24);

        //create the drawer and remember the `Drawer` result object
        com.mikepenz.materialdrawer.Drawer result = new DrawerBuilder()
                .withActivity(MainActivity.this)
//                .withAccountHeader(headerResult)
                .withTranslucentStatusBar(false)

//                .withDrawerGravity(Gravity.END)
//                .withToolbar(toolbar)
                .addDrawerItems(
                        item2,
                        new DividerDrawerItem(),
                        item5,
                        new DividerDrawerItem(),
                        item3
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem.getIdentifier() == 1) {
                            vp.setCurrentItem(0, true);

                        } else if (drawerItem.getIdentifier() == 2) {
                            vp.setCurrentItem(1, true);

                        } else if (drawerItem.getIdentifier() == 3) {
                            vp.setCurrentItem(2, true);

                        }
                        return false;
                    }
                })
                .build();
        result.setToolbar(MainActivity.this, toolbar);
    }
}