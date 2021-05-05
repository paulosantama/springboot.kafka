package com.example.kafka.demo.domain

class Greeting {

    private String msg
    private String name

    Greeting() {
    }

    Greeting(String msg, String name) {
        this.msg = msg
        this.name = name
    }

    String getMsg() {
        return msg
    }

    void setMsg(String msg) {
        this.msg = msg
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

}
