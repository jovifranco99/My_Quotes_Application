 package ca.jovanifrancis.myquotesapplication;

import static java.lang.String.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

 public class Quotes extends AppCompatActivity {

    private TextView quoteTxt, writerName;

    private final List<QuotesList> quotesLists = new ArrayList<>();

    // quote position in quotesLists increment when user click on next button, decrement when user click on next button
    private int currentQuotePosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView categoryName = findViewById(R.id.categoryName);
        quoteTxt = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        final Button prevBtn = findViewById(R.id.prevBtn);
        final Button nextBtn = findViewById(R.id.nextBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);

        // get category name from CategoriesAdapter class
        Intent i = new Intent();
        //String name = getIntent().getStringExtra("name");
        String name = i.getStringExtra("name");

        Log.i("Jovi", "" + name);
        // set Category Name to TextView
        //categoryName.setText(name);

        if(name.equals("Life")) {
            quotesLists.addAll(QuotesData.getLifeQuotes());
        }
//        else if(getName.equals("Success")){
//            quotesLists.addAll(QuotesData.getSuccessQuotes());
//
//        }
//        else if(getName.equals("Inspirational")){
//            quotesLists.addAll(QuotesData.getInspirationalQuotes());
//
//        }
//        else if(getName.equals("Smiles")){
//            quotesLists.addAll(QuotesData.getSmilesQuotes());
//
//        }
//        else if(getName.equals("Love")){
//            quotesLists.addAll(QuotesData.getLoveQuotes());
//
//        }


        setQuoteToTextView();

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentQuotePosition--;

                if (currentQuotePosition < 0){
                    currentQuotePosition = quotesLists.size() - 1;
                }

                setQuoteToTextView();
            }
        });

        copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // copy quote and write to clipboard.
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("quote", quotesLists.get(currentQuotePosition).getQuote()+"\nby "+quotesLists.get(currentQuotePosition).getWriter());
                clipboardManager.setPrimaryClip(clipData);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                currentQuotePosition++;

                if (currentQuotePosition >= quotesLists.size()){
                    currentQuotePosition = 0;
                }

            }
        });
    }

    private void setQuoteToTextView(){

        quoteTxt.setText(quotesLists.get(currentQuotePosition).getQuote());

        quoteTxt.setText(quotesLists.get(currentQuotePosition).getWriter());
    }
}