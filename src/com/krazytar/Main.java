package com.krazytar;

import sx.blah.discord.api.IDiscordClient;

public class Main {
    public static void main(String[] args) {
        IDiscordClient dc = BotUtils.getBuiltClient();
        dc.getDispatcher().registerListener(new Events());
        dc.login();
    }
}
