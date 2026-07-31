package io.ably.lib.rest;

import io.ably.lib.push.PushChannel;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ChannelOptions;

/* loaded from: classes7.dex */
public class Channel extends ChannelBase {
    public final PushChannel push;

    Channel(AblyBase ablyBase, String str, ChannelOptions channelOptions) throws AblyException {
        super(ablyBase, str, channelOptions);
        this.push = new PushChannel(this, (AblyRest) ablyBase);
    }
}
