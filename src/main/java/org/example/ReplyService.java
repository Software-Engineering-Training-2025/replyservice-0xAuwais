package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
interface ReplyStrategy {
    public String reply(String message);
}
 class FromalReply implements ReplyStrategy {
    public String reply(String message) {
        // - For known messages, return exact string for each ReplyType.
        if (message.equals("hi")) {
            return "Hello. How may I assist you today?";
        }
        if (message.equals("hello")) {
            return "Hello. How may I assist you today?";
        }
        if (message.equals("how are you")) {
            return "I am functioning properly. How may I assist you?";
        }
        if (message.equals("i need help")) {
            return "I can assist with that. Please provide more details.";
        }
        if (message.equals("can you help me with my account")) {
            return "Certainly. Please describe the account issue.";
        }
        if (message.equals("thanks")) {
            return "You are welcome.";
        }
        if (message.equals("bye")) {
            return "Goodbye.";
        }
        if (message.equals("what is your name")) {
            return "I am your virtual assistant.";
        } else {
            return "Could you clarify your request?";
        }
    }
}
class FreindlyReply implements ReplyStrategy {
    public String reply(String message) {
        if(message.equals("hi")){
            return "Hey there! \uD83D\uDE0A How can I help?";
        }
        if(message.equals("hello")){
            return "Hi! \uD83D\uDC4B What’s up?";
        }
        if(message.equals("how are you")){
            return "Doing great! \uD83D\uDE04 How can I help?";
        }
        if(message.equals("i need help")){
            return "I’ve got you! \uD83D\uDE42 Tell me a bit more.";
        }
        if(message.equals("can you help me with my account")){
            return "Sure thing! \uD83D\uDE0A What’s wrong with the account?";
        }
        if(message.equals("thanks")){
            return "Anytime! \uD83D\uDE4C";
        }
        if(message.equals("bye")){
            return "See you later! \uD83D\uDC4B";
        }
        if(message.equals("what is your name")){
            return "I’m your helper bot \uD83E\uDD16";
        }
        else {
            return "Could you tell me more?";
        }
    }
}
class ConciseReply implements ReplyStrategy {
    public String reply(String message) {
        if(message.equals("hi")){
            return "Hello. How can I help?";
        }
        if(message.equals("hello")){
            return "Hello. How can I help?";
        }
        if(message.equals("how are you")){
            return "I’m good. How can I help?";
        }
        if(message.equals("i need help")){
            return "Share details; I’ll help.";
        }
        if(message.equals("can you help me with my account")){
            return "Describe the account issue…";
        }
        if(message.equals("thanks")){
            return "You’re welcome.";
        }
        if(message.equals("bye")){
            return "Goodbye.";
        }
        if(message.equals("what is your name")){
            return "I’m your assistant.";
        }
        else {
            return "Please clarify.";
        }
    }
}

public class ReplyService {
    private ReplyStrategy strategy;

    public String reply(String message , ReplyType type) {
        if(message == null||message.trim().isEmpty()){
            return "Please say something.";
        }
        if(type==ReplyType.FORMAL) {
            strategy = new FromalReply();
            return strategy.reply(message);
        }
        if(type==ReplyType.FRIENDLY) {
            strategy = new FreindlyReply();
            return strategy.reply(message);
        }
        if(type==ReplyType.CONCISE) {
            strategy = new ConciseReply();
            return strategy.reply(message);
        }
        else {
            return "Not Implemented Yet";
        }
    }
}
