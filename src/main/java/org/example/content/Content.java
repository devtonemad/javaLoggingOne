package org.example.content;

import org.apache.log4j.Logger;

public class Content {

    static Logger log = Logger.getLogger(Content.class.getName());

    public void print() {
        log.error("This is an Info");
    }

}
