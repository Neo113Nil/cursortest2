package io.ktor.client.plugins;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserAgent.kt */
/* loaded from: classes6.dex */
public final class UserAgentConfig {
    private String agent;

    public UserAgentConfig(String agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.agent = agent;
    }

    public /* synthetic */ UserAgentConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Ktor http-client" : str);
    }

    public final String getAgent() {
        return this.agent;
    }

    public final void setAgent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agent = str;
    }
}
