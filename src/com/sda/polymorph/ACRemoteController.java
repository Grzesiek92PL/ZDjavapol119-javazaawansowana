package com.sda.polymorph;

public class ACRemoteController implements RemoteController {
    @Override
    public void enable(boolean enable) {
        System.out.println("ACRemote is enable? - " + enable);
    }
}
