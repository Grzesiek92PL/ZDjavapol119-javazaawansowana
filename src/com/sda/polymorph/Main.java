package com.sda.polymorph;

public class Main {

    public static void main(String[] args) {

        RemoteController remoteController = new TvRemoteController();
        remoteController.enable(true);
        remoteController = new ACRemoteController();
        remoteController.enable(false);
    }
}
