package io.kommunicate;

import android.content.Context;

import com.applozic.mobicommons.json.JsonMarker;

import java.util.List;

import io.kommunicate.callbacks.KmCallback;
import io.kommunicate.users.KMUser;

public class KmChatBuilder extends JsonMarker {
    private Context context;
    private boolean isSingleChat = true;
    private boolean withPreChat = false;
    private KMUser kmUser;
    private String applicationId;
    private String userId;
    private String password;
    private String displayName;
    private String imageUrl;
    private List<String> agentIds;
    private List<String> botIds;
    private boolean skipChatList = true;
    private String chatId;
    private String chatName;
    private String deviceToken;

    public KmChatBuilder(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public boolean isSingleChat() {
        return isSingleChat;
    }

    public KmChatBuilder setSingleChat(boolean singleChat) {
        this.isSingleChat = singleChat;
        return this;
    }

    public boolean isWithPreChat() {
        return withPreChat;
    }

    public KmChatBuilder setWithPreChat(boolean withPreChat) {
        this.withPreChat = withPreChat;
        return this;
    }

    public KMUser getKmUser() {
        return kmUser;
    }

    public KmChatBuilder setKmUser(KMUser kmUser) {
        this.kmUser = kmUser;
        return this;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public KmChatBuilder setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public KmChatBuilder setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public KmChatBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public KmChatBuilder setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public KmChatBuilder setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public List<String> getAgentIds() {
        return agentIds;
    }

    public KmChatBuilder setAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    public List<String> getBotIds() {
        return botIds;
    }

    public KmChatBuilder setBotIds(List<String> botIds) {
        this.botIds = botIds;
        return this;
    }

    public String getChatId() {
        return chatId;
    }

    public KmChatBuilder setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    public boolean isSkipChatList() {
        return skipChatList;
    }

    public KmChatBuilder setSkipChatList(boolean skipChatList) {
        this.skipChatList = skipChatList;
        return this;
    }

    public String getChatName() {
        return chatName;
    }

    public KmChatBuilder setChatName(String chatName) {
        this.chatName = chatName;
        return this;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public KmChatBuilder setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }

    public void createChat(KmCallback callback) {
        KmConversationHelper.createChat(this, callback);
    }

    public void launchChat(KmCallback callback) {
        KmConversationHelper.launchChat(this, callback);
    }
}
