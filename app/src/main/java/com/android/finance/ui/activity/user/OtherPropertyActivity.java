package com.android.finance.ui.activity.user;

import android.os.Bundle;
import android.view.View;

import com.android.finance.R;
import com.android.finance.ui.activity.common.BaseActivity;
import com.android.finance.ui.widget.CommonTitleBar;
import com.android.finance.ui.widget.text.InputEditText;
import com.android.finance.util.ToastUtil;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by yanxin on 16/3/3.
 */
@EActivity(R.layout.activity_user_other_property)
public class OtherPropertyActivity extends BaseActivity {

    @ViewById(R.id.titleBar)
    CommonTitleBar mTitleBar;

    @ViewById(R.id.name)
    InputEditText mName;
    @ViewById(R.id.years)
    InputEditText mYears;
    @ViewById(R.id.detail)
    InputEditText mDetail;
    @ViewById(R.id.worth)
    InputEditText mWorth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void initView() {
        mTitleBar.setTitle(getString(R.string.user_other_title));
        mTitleBar.setActivity(this);
        mTitleBar.setRightViewVisible(View.VISIBLE,getString(R.string.save));
        mTitleBar.setTitleBarListener(new CommonTitleBar.TitleBarListener() {
            @Override
            public void leftOnClick() {

            }

            @Override
            public void rightOnClick() {
                ToastUtil.showShortToast("保存");
            }
        });

    }

}