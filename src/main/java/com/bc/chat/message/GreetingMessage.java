package com.bc.chat.message;

public class GreetingMessage {

    private String content;
    
    public GreetingMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
