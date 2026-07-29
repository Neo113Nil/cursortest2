package com.google.firebase.logger;

import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1888sN;
import o.AbstractC1973tg;
import o.C0057Cc;
import o.InterfaceC2114vp;
import o.UT;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b&\u0018\u0000 %2\u00020\u0001:\u0004$%&'B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ9\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0002\u0010 J;\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0012\b\u0002\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010 J9\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010\"\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J9\u0010#\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJ\u001c\u0010#\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/google/firebase/logger/Logger;", "", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getMinLevel", "()Lcom/google/firebase/logger/Logger$Level;", "setMinLevel", "(Lcom/google/firebase/logger/Logger$Level;)V", "getTag", "()Ljava/lang/String;", "debug", "", "format", "args", "", "throwable", "", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "msg", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "info", "log", "level", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "logIfAble", "verbose", "warn", "AndroidLogger", "Companion", "FakeLogger", "Level", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;
    private Level minLevel;
    private final String tag;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ9\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/logger/Logger$AndroidLogger;", "Lcom/google/firebase/logger/Logger;", "tag", "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "log", "", "level", "format", "args", "", "", "throwable", "", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidLogger extends Logger {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(String str, boolean z, Level level) {
            super(str, z, level, null);
            AbstractC0048Bt.n(str, "tag");
            AbstractC0048Bt.n(level, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable throwable) {
            AbstractC0048Bt.n(level, "level");
            AbstractC0048Bt.n(format, "format");
            AbstractC0048Bt.n(args, "args");
            if (args.length != 0) {
                Object[] copyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            }
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                String tag = getTag();
                return throwable != null ? Log.v(tag, format, throwable) : Log.v(tag, format);
            }
            if (i == 2) {
                String tag2 = getTag();
                return throwable != null ? Log.d(tag2, format, throwable) : Log.d(tag2, format);
            }
            if (i == 3) {
                String tag3 = getTag();
                return throwable != null ? Log.i(tag3, format, throwable) : Log.i(tag3, format);
            }
            if (i == 4) {
                String tag4 = getTag();
                return throwable != null ? Log.w(tag4, format, throwable) : Log.w(tag4, format);
            }
            if (i != 5) {
                throw new C0057Cc();
            }
            String tag5 = getTag();
            return throwable != null ? Log.e(tag5, format, throwable) : Log.e(tag5, format);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "()V", "loggers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/google/firebase/logger/Logger;", "getLogger", "tag", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "setupFakeLogger", "Lcom/google/firebase/logger/Logger$FakeLogger;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1973tg abstractC1973tg) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        public final Logger getLogger(String tag, boolean enabled, Level minLevel) {
            Object putIfAbsent;
            AbstractC0048Bt.n(tag, "tag");
            AbstractC0048Bt.n(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object obj = concurrentHashMap.get(tag);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (obj = new AndroidLogger(tag, enabled, minLevel)))) != null) {
                obj = putIfAbsent;
            }
            return (Logger) obj;
        }

        public final FakeLogger setupFakeLogger(String tag, boolean enabled, Level minLevel) {
            AbstractC0048Bt.n(tag, "tag");
            AbstractC0048Bt.n(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, enabled, minLevel);
            Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "", "tag", "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "level", "format", "", "", "args", "", "throwable", "toLogMessage", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/String;", "", "log", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "Lo/bY;", "clearLogMessages", "()V", "message", "hasLogMessage", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "predicate", "hasLogMessageThat", "(Lo/vp;)Z", "", "record", "Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FakeLogger extends Logger {
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(String str, boolean z, Level level) {
            super(str, z, level, null);
            AbstractC0048Bt.n(str, "tag");
            AbstractC0048Bt.n(level, "minLevel");
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String format, Object[] args, Throwable throwable) {
            if (args.length != 0) {
                Object[] copyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            }
            if (throwable != null) {
                String str = level + ' ' + format + ' ' + Log.getStackTraceString(throwable);
                if (str != null) {
                    return str;
                }
            }
            return level + ' ' + format;
        }

        public final void clearLogMessages() {
            this.record.clear();
        }

        public final boolean hasLogMessage(String message) {
            AbstractC0048Bt.n(message, "message");
            List<String> list = this.record;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (UT.E((String) it.next(), message)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean hasLogMessageThat(InterfaceC2114vp predicate) {
            AbstractC0048Bt.n(predicate, "predicate");
            List<String> list = this.record;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable throwable) {
            AbstractC0048Bt.n(level, "level");
            AbstractC0048Bt.n(format, "format");
            AbstractC0048Bt.n(args, "args");
            String logMessage = toLogMessage(level, format, args, throwable);
            System.out.println((Object) AbstractC1888sN.s("Log: ", logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", "priority", "", "(Ljava/lang/String;II)V", "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        Level(int i) {
            this.priority = i;
        }

        /* renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }
    }

    public /* synthetic */ Logger(String str, boolean z, Level level, AbstractC1973tg abstractC1973tg) {
        this(str, z, level);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    public static final Logger getLogger(String str, boolean z, Level level) {
        return INSTANCE.getLogger(str, z, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String format, Object[] args, Throwable throwable) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority() <= level.getPriority() || Log.isLoggable(this.tag, level.getPriority())) {
            return log(level, format, args, throwable);
        }
        return 0;
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    public static final FakeLogger setupFakeLogger(String str, boolean z, Level level) {
        return INSTANCE.setupFakeLogger(str, z, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int debug(String str) {
        AbstractC0048Bt.n(str, "msg");
        return debug$default(this, str, null, 2, null);
    }

    public final int error(String str) {
        AbstractC0048Bt.n(str, "msg");
        return error$default(this, str, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Level getMinLevel() {
        return this.minLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int info(String str) {
        AbstractC0048Bt.n(str, "msg");
        return info$default(this, str, null, 2, null);
    }

    public abstract int log(Level level, String format, Object[] args, Throwable throwable);

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setMinLevel(Level level) {
        AbstractC0048Bt.n(level, "<set-?>");
        this.minLevel = level;
    }

    public final int verbose(String str) {
        AbstractC0048Bt.n(str, "msg");
        return verbose$default(this, str, null, 2, null);
    }

    public final int warn(String str) {
        AbstractC0048Bt.n(str, "msg");
        return warn$default(this, str, null, 2, null);
    }

    private Logger(String str, boolean z, Level level) {
        this.tag = str;
        this.enabled = z;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public final int debug(String str, Object... objArr) {
        AbstractC0048Bt.n(str, "format");
        AbstractC0048Bt.n(objArr, "args");
        return debug$default(this, str, objArr, null, 4, null);
    }

    public final int error(String str, Object... objArr) {
        AbstractC0048Bt.n(str, "format");
        AbstractC0048Bt.n(objArr, "args");
        return error$default(this, str, objArr, null, 4, null);
    }

    public final int info(String str, Object... objArr) {
        AbstractC0048Bt.n(str, "format");
        AbstractC0048Bt.n(objArr, "args");
        return info$default(this, str, objArr, null, 4, null);
    }

    public final int verbose(String str, Object... objArr) {
        AbstractC0048Bt.n(str, "format");
        AbstractC0048Bt.n(objArr, "args");
        return verbose$default(this, str, objArr, null, 4, null);
    }

    public final int warn(String str, Object... objArr) {
        AbstractC0048Bt.n(str, "format");
        AbstractC0048Bt.n(objArr, "args");
        return warn$default(this, str, objArr, null, 4, null);
    }

    public final int debug(String format, Object[] args, Throwable throwable) {
        AbstractC0048Bt.n(format, "format");
        AbstractC0048Bt.n(args, "args");
        return logIfAble(Level.DEBUG, format, args, throwable);
    }

    public final int error(String format, Object[] args, Throwable throwable) {
        AbstractC0048Bt.n(format, "format");
        AbstractC0048Bt.n(args, "args");
        return logIfAble(Level.ERROR, format, args, throwable);
    }

    public final int info(String format, Object[] args, Throwable throwable) {
        AbstractC0048Bt.n(format, "format");
        AbstractC0048Bt.n(args, "args");
        return logIfAble(Level.INFO, format, args, throwable);
    }

    public final int verbose(String format, Object[] args, Throwable throwable) {
        AbstractC0048Bt.n(format, "format");
        AbstractC0048Bt.n(args, "args");
        return logIfAble(Level.VERBOSE, format, args, throwable);
    }

    public final int warn(String format, Object[] args, Throwable throwable) {
        AbstractC0048Bt.n(format, "format");
        AbstractC0048Bt.n(args, "args");
        return logIfAble(Level.WARN, format, args, throwable);
    }

    public final int debug(String msg, Throwable throwable) {
        AbstractC0048Bt.n(msg, "msg");
        return logIfAble$default(this, Level.DEBUG, msg, null, throwable, 4, null);
    }

    public final int error(String msg, Throwable throwable) {
        AbstractC0048Bt.n(msg, "msg");
        return logIfAble$default(this, Level.ERROR, msg, null, throwable, 4, null);
    }

    public final int info(String msg, Throwable throwable) {
        AbstractC0048Bt.n(msg, "msg");
        return logIfAble$default(this, Level.INFO, msg, null, throwable, 4, null);
    }

    public final int verbose(String msg, Throwable throwable) {
        AbstractC0048Bt.n(msg, "msg");
        return logIfAble$default(this, Level.VERBOSE, msg, null, throwable, 4, null);
    }

    public final int warn(String msg, Throwable throwable) {
        AbstractC0048Bt.n(msg, "msg");
        return logIfAble$default(this, Level.WARN, msg, null, throwable, 4, null);
    }
}
