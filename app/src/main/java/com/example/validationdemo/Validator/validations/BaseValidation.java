package com.example.validationdemo.Validator.validations;

import android.content.Context;


abstract class BaseValidation implements Validation {

    protected Context mContext;

    protected BaseValidation(Context context) {
        mContext = context;
    }

}