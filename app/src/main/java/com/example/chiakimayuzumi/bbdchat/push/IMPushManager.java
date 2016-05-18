package com.example.chiakimayuzumi.bbdchat.push;


import android.content.Context;
import android.content.Intent;
import com.example.chiakimayuzumi.bbdchat.entities.Message;


/**
 * Created by chiakimayuzumi on 16/5/17.
 */
public class IMPushManager {

  private static IMPushManager mInstance;

  public Context context;

  public IMPushManager(Context context) {
    this.context = context;
  }

  //单例模式的构造器
  public static IMPushManager getInstance(Context context) {
    if (mInstance == null) {
      mInstance = new IMPushManager(context);
    }
    return mInstance;
  }

  //有消息进来，解析一下，写的通用一点，希望能解析的内容多点，既可以解析消息又可以解析通知
  public void handlePush(String content) {

  }

  public void sendMessage(Message message) {

  }

  public void addObserver(PushWatcher watcher) {
    PushChanger.getInstance().addObserver(watcher);
  }

  public void removeObserver(PushWatcher watcher) {
    PushChanger.getInstance().deleteObserver(watcher);
  }

  public void removeObservers() {
    PushChanger.getInstance().deleteObservers();
  }

  //后面的暂时用不到
  public void messageUpdated(int percent,Message message) {
    PushChanger.getInstance().notifyChanged(percent, message);
  }

  public void startPush() {

  }

  public void stopPush(){

  }

  public boolean isAppInForeground() {

    return false;
  }

  public void startNotification(String message) {

  }

  public void startNotification(String message, Intent intent) {

  }

}
