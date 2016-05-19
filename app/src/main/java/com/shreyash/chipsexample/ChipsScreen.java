package com.shreyash.chipsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Rfc822Tokenizer;

import com.android.ex.chips.BaseRecipientAdapter;
import com.android.ex.chips.RecipientEditTextView;

public class ChipsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chips_screen);
        RecipientEditTextView mTagsET = (RecipientEditTextView) findViewById(R.id.email_retv);
        mTagsET.setTokenizer(new Rfc822Tokenizer());
        mTagsET.setAdapter(new BaseRecipientAdapter(BaseRecipientAdapter.QUERY_TYPE_EMAIL, this) {
        });
    }
}
