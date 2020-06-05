package com.bc.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import com.bc.chat.message.GreetingMessage;
import com.bc.chat.message.HelloMessage;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMessage greeting(HelloMessage message) throws Exception {
        Thread.sleep(500);
        return new GreetingMessage("Hello, "+ HtmlUtils.htmlEscape(message.getName()));
    }
}
