package com.barista_v.ultrarecyclerview.sample;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class StaggeredGridActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    startAddingItems();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.activity_horizontal_sample;
  }

  @Override
  protected boolean isSwipeToDismissEnabled() {
    return false;
  }

  @Override
  protected RecyclerView.LayoutManager getLayoutManager() {
    return new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
  }
}
