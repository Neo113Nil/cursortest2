package com.my.tracker.miniapps;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public abstract class MiniAppEventBuilder {
    final int a;
    final String b;
    final String c;
    String d;
    String e;
    String f;
    Map g;

    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f = str3;
        }

        @NonNull
        @AnyThread
        public CustomEventBuilder withCustomUserId(@Nullable String str) {
            this.e = str;
            return this;
        }

        @NonNull
        @AnyThread
        public CustomEventBuilder withEventParams(@Nullable Map<String, String> map) {
            this.g = map;
            return this;
        }
    }

    public static final class EventBuilder {
        final String a;
        final String b;

        EventBuilder(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @NonNull
        @AnyThread
        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.a, this.b);
        }

        @NonNull
        @AnyThread
        public CustomEventBuilder customEvent(@NonNull String str) {
            return new CustomEventBuilder(this.a, this.b, str);
        }

        @NonNull
        @AnyThread
        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.a, this.b);
        }

        @NonNull
        @AnyThread
        public OpenEventBuilder openEvent(@NonNull String str) {
            return new OpenEventBuilder(this.a, this.b, str);
        }

        @NonNull
        @AnyThread
        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.a, this.b);
        }
    }

    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.d = str3;
        }
    }

    public static final class UserEventBuilder extends MiniAppEventBuilder {
        UserEventBuilder(int i, String str, String str2) {
            super(i, str, str2);
        }

        @NonNull
        @AnyThread
        public UserEventBuilder withCustomUserId(@Nullable String str) {
            this.e = str;
            return this;
        }
    }

    MiniAppEventBuilder(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @NonNull
    @AnyThread
    public static EventBuilder newEventBuilder(@NonNull String str, @NonNull String str2) {
        return new EventBuilder(str, str2);
    }

    @NonNull
    @AnyThread
    public final MiniAppEvent build() {
        return new MiniAppEvent(this.a, this.b, this.c, this.d, this.e, this.f, this.g == null ? null : new TreeMap(this.g));
    }
}
