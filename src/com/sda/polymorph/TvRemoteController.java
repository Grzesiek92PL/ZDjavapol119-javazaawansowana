package com.sda.polymorph;

public class TvRemoteController implements RemoteController {
    @Override
    public void enable(boolean enable) {
        System.out.println("TvRemote is enable? - " + enable);
    }
}
