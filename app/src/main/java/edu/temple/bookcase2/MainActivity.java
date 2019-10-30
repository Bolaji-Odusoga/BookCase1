package edu.temple.bookcase2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   int bookPosition;

    String[] bookArray;

    private ViewPager viewPager;
    BookDetailsFragment bd;
    BookListFragment bl;
    ViewPage vp;
    boolean singlePane;
    FragmentManager fm;
    private ViewPageCollectionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context= getApplicationContext();

        Resources res = context.getResources();
        String [] list =res.getStringArray(R.array.arrayList);

           bookArray  = new String[list.length];

        for(int i = 0 ; i < list.length;i++){

            bookArray[i]= list[i];
        }

        singlePane = findViewById(R.id.fragment_bookDetails) == null;

        bd = new BookDetailsFragment();
        bl = new BookListFragment();


        fm = getSupportFragmentManager();



        if (singlePane) {//single pane

            BookDetailsFragment b = new BookDetailsFragment();
            viewPager=findViewById(R.id.pager);
            adapter= new ViewPageCollectionAdapter((getSupportFragmentManager()));

            viewPager.setAdapter(adapter);


            //fm.beginTransaction().replace(R.id.bookTitle,vp).commit();


        }
        else {
            //2 pane
          //  fm.beginTransaction().replace(R.id.bookList, bl).commit();

        }



    }

    private void bookClicked(){
       new  BookDetailsFragment().displayBook(bookArray[bookPosition]);

    }
}
