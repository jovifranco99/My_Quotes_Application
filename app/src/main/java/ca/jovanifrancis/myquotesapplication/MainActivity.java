package ca.jovanifrancis.myquotesapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ca.jovanifrancis.myquotesapplication.categories.CategoriesAdapter;
import ca.jovanifrancis.myquotesapplication.categories.CategoriesList;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList>  categoriesLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        // add categories to categoriesLists
        CategoriesList lifeCategory = new CategoriesList("Life", R.drawable.quoteonlife);
        categoriesLists.add(lifeCategory); //add Life category to categoriesLists

        CategoriesList inspirationalCategory = new CategoriesList("Inspiration", R.drawable.inspirational_cat);
        categoriesLists.add(inspirationalCategory); //add Inspiration category to categoriesLists

        CategoriesList smilesCategory = new CategoriesList("Smiles", R.drawable.smiles_cat);
        categoriesLists.add(smilesCategory); //add Smiles category to categoriesLists

        CategoriesList successCategory = new CategoriesList("Success", R.drawable.success_cat);
        categoriesLists.add(successCategory); //add Success category to categoriesLists

        CategoriesList loveCategory = new CategoriesList("Love", R.drawable.love_cat);
        categoriesLists.add(loveCategory); //add love category to categoriesLists

        // set adapter to recyclerView
        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists, MainActivity.this));
    }
}