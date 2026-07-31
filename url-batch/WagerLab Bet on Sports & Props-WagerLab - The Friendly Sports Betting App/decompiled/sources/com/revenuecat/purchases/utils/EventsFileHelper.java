package com.revenuecat.purchases.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.Event;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;

/* compiled from: EventsFileHelper.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u00020\r2\u001a\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001b\u0012\u0004\u0012\u00020\r0\tJ \u0010\u001c\u001a\u00020\r2\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001b\u0012\u0004\u0012\u00020\r0\tR\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/utils/EventsFileHelper;", "T", "Lcom/revenuecat/purchases/utils/Event;", "", "fileHelper", "Lcom/revenuecat/purchases/common/FileHelper;", "filePath", "", "eventSerializer", "Lkotlin/Function1;", "eventDeserializer", "(Lcom/revenuecat/purchases/common/FileHelper;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "appendEvent", "", NotificationCompat.CATEGORY_EVENT, "(Lcom/revenuecat/purchases/utils/Event;)V", "clear", "eventsToDeleteCount", "", "deleteFile", "fileSizeInKB", "", "mapToEvent", TypedValues.Custom.S_STRING, "(Ljava/lang/String;)Lcom/revenuecat/purchases/utils/Event;", "readFile", "block", "Lkotlin/sequences/Sequence;", "readFileAsJson", "Lorg/json/JSONObject;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class EventsFileHelper<T extends Event> {
    private final Function1<String, T> eventDeserializer;
    private final Function1<T, String> eventSerializer;
    private final FileHelper fileHelper;
    private final String filePath;

    /* JADX WARN: Multi-variable type inference failed */
    public EventsFileHelper(FileHelper fileHelper, String filePath, Function1<? super T, String> function1, Function1<? super String, ? extends T> function12) {
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.fileHelper = fileHelper;
        this.filePath = filePath;
        this.eventSerializer = function1;
        this.eventDeserializer = function12;
    }

    public /* synthetic */ EventsFileHelper(FileHelper fileHelper, String str, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileHelper, str, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : function12);
    }

    public final synchronized void appendEvent(T event) {
        String event2;
        Intrinsics.checkNotNullParameter(event, "event");
        FileHelper fileHelper = this.fileHelper;
        String str = this.filePath;
        StringBuilder sb = new StringBuilder();
        Function1<T, String> function1 = this.eventSerializer;
        if (function1 == null || (event2 = function1.invoke(event)) == null) {
            event2 = event.toString();
        }
        fileHelper.appendToFile(str, sb.append(event2).append('\n').toString());
    }

    public final synchronized double fileSizeInKB() {
        return this.fileHelper.fileSizeInKB(this.filePath);
    }

    public final synchronized void readFile(final Function1<? super Sequence<? extends T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.eventDeserializer != null && !this.fileHelper.fileIsEmpty(this.filePath)) {
            this.fileHelper.readFilePerLines(this.filePath, new Function1<Sequence<? extends String>, Unit>() { // from class: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Sequence<? extends String> sequence) {
                    invoke2((Sequence<String>) sequence);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Sequence<String> sequence) {
                    Intrinsics.checkNotNullParameter(sequence, "sequence");
                    Function1<Sequence<? extends T>, Unit> function1 = block;
                    final EventsFileHelper<T> eventsFileHelper = this;
                    function1.invoke(SequencesKt.map(sequence, new Function1<String, T>() { // from class: com.revenuecat.purchases.utils.EventsFileHelper$readFile$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TT; */
                        @Override // kotlin.jvm.functions.Function1
                        public final Event invoke(String line) {
                            Event mapToEvent;
                            Intrinsics.checkNotNullParameter(line, "line");
                            mapToEvent = eventsFileHelper.mapToEvent(line);
                            return mapToEvent;
                        }
                    }));
                }
            });
        }
        block.invoke(SequencesKt.emptySequence());
    }

    public final synchronized void readFileAsJson(final Function1<? super Sequence<? extends JSONObject>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.fileHelper.fileIsEmpty(this.filePath)) {
            block.invoke(SequencesKt.emptySequence());
        } else {
            this.fileHelper.readFilePerLines(this.filePath, new Function1<Sequence<? extends String>, Unit>() { // from class: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Sequence<? extends String> sequence) {
                    invoke2((Sequence<String>) sequence);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Sequence<String> sequence) {
                    Intrinsics.checkNotNullParameter(sequence, "sequence");
                    block.invoke(SequencesKt.map(sequence, new Function1<String, JSONObject>() { // from class: com.revenuecat.purchases.utils.EventsFileHelper$readFileAsJson$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final JSONObject invoke(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return new JSONObject(it);
                        }
                    }));
                }
            });
        }
    }

    public final synchronized void clear(int eventsToDeleteCount) {
        this.fileHelper.removeFirstLinesFromFile(this.filePath, eventsToDeleteCount);
    }

    public final synchronized void deleteFile() {
        if (!this.fileHelper.deleteFile(this.filePath)) {
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to delete events file in " + this.filePath + '.');
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T mapToEvent(String string) {
        Function1<String, T> function1 = this.eventDeserializer;
        if (function1 == null) {
            return null;
        }
        try {
            return function1.invoke(string);
        } catch (SerializationException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e);
            return null;
        } catch (IllegalArgumentException e2) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing event from file: " + string, e2);
            return null;
        }
    }
}
