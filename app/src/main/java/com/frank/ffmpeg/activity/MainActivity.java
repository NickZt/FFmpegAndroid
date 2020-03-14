package com.frank.ffmpeg.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.frank.ffmpeg.R;

/**
 * 使用ffmpeg进行Audio and video processing入口
 * Created by frank on 2018/1/23.
 */
public class MainActivity extends BaseActivity {

    @Override
    int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViewsWithClick(
                R.id.btn_audio,
                R.id.btn_video,
                R.id.btn_media,
                R.id.btn_play,
                R.id.btn_push,
                R.id.btn_live,
                R.id.btn_filter,
                R.id.btn_preview,
                R.id.btn_probe
        );
    }

    @Override
    public void onViewClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_audio:// Audio处理
                intent.setClass(MainActivity.this, AudioHandleActivity.class);
                break;
            case R.id.btn_video://Video processing
                intent.setClass(MainActivity.this, VideoHandleActivity.class);
                break;
            case R.id.btn_media://Audio and video processing
                intent.setClass(MainActivity.this, MediaHandleActivity.class);
                break;
            case R.id.btn_play://音视频Play
                intent.setClass(MainActivity.this, MediaPlayerActivity.class);
                break;
            case R.id.btn_push://FFmpeg推流
                intent.setClass(MainActivity.this, PushActivity.class);
                break;
            case R.id.btn_live://Live streaming live:AAC Audio coding 、H264 Video encoding 、RTMP推流
                intent.setClass(MainActivity.this, LiveActivity.class);
                break;
            case R.id.btn_filter://滤镜特效
                intent.setClass(MainActivity.this, FilterActivity.class);
                break;
            case R.id.btn_preview://视频拖动实时预览
                intent.setClass(MainActivity.this, VideoPreviewActivity.class);
                break;
            case R.id.btn_probe://解析音视频多媒体格式
                intent.setClass(MainActivity.this, ProbeFormatActivity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }

    @Override
    void onSelectedFile(String filePath) {

    }

}
