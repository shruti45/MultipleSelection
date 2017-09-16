package com.example.user.multipleselection;
import android.graphics.Bitmap;
import android.view.View;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

/**
 * Created by user on 4/1/2016.
 */
public class SimpleImageLoadingListener implements ImageLoadingListener {
    @Override
    public void onLoadingStarted(String imageUri, View view) {
        // Empty implementation
    }

    @Override
    public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
        // Empty implementation
    }

    @Override
    public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
        // Empty implementation
    }

    @Override
    public void onLoadingCancelled(String imageUri, View view) {
        // Empty implementation
    }
}