package io.bidmachine.internal;

import com.explorestack.protobuf.ProtocolStringList;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParamsKt;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventTaskType;
import io.bidmachine.rendering.model.EventType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.bidmachine.internal.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC6013h {

    /* renamed from: io.bidmachine.internal.h$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.OnImpression.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.OnBillableImpression.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventType.OnClick.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventType.OnMute.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EventType.OnUnMute.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EventType.OnPause.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EventType.OnResume.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EventType.OnSkip.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EventType.OnClose.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EventType.OnStart.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EventType.OnFirstQuartile.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EventType.OnMidpoint.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EventType.OnThirdQuartile.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EventType.OnComplete.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EventType.OnProgress.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EventType.OnUseCustomClose.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EventType.OnScheduled.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EventType.OnNavigate.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EventType.OnExpand.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EventType.OnCollapse.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EventType.OnClickResolved.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventTaskType.values().length];
            try {
                iArr2[EventTaskType.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EventTaskType.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[EventTaskType.NotifyOpen.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[EventTaskType.Skip.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[EventTaskType.Close.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[EventTaskType.Mute.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[EventTaskType.UnMute.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[EventTaskType.Repeat.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[EventTaskType.Show.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[EventTaskType.Hide.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[EventTaskType.Progress.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[EventTaskType.Schedule.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[EventTaskType.Start.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[EventTaskType.LockVisibility.ordinal()] = 14;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[EventTaskType.UnlockVisibility.ordinal()] = 15;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[EventTaskType.SimulateClick.ordinal()] = 16;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[EventTaskType.OpenPrivacySheet.ordinal()] = 17;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr2[EventTaskType.ToggleStateGroups.ordinal()] = 18;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr2[EventTaskType.Expand.ordinal()] = 19;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr2[EventTaskType.Collapse.ordinal()] = 20;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr2[EventTaskType.RequestPermission.ordinal()] = 21;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr2[EventTaskType.ReportClick.ordinal()] = 22;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final EventTaskParams a(Rendering.Phase.Event.Task task) {
        EventTaskType eventTaskType;
        Intrinsics.checkNotNullParameter(task, "<this>");
        if (task == Rendering.Phase.Event.Task.getDefaultInstance() || (eventTaskType = AdaptiveRenderingParamsKt.toEventTaskType(task.getName())) == null) {
            return null;
        }
        String target = task.getTarget();
        Intrinsics.checkNotNullExpressionValue(target, "target");
        String value = task.getValue();
        ProtocolStringList stateGroupsList = task.getStateGroupsList();
        Intrinsics.checkNotNullExpressionValue(stateGroupsList, "stateGroupsList");
        return new EventTaskParams(eventTaskType, target, value, CollectionsKt.toList(stateGroupsList));
    }

    public static final List b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventTaskParams a2 = a((Rendering.Phase.Event.Task) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public static final Rendering.Phase.Event.Task a(EventTaskParams eventTaskParams) {
        Intrinsics.checkNotNullParameter(eventTaskParams, "<this>");
        Rendering.Phase.Event.Task.Builder addAllStateGroups = Rendering.Phase.Event.Task.newBuilder().setName(a(eventTaskParams.getEventTaskType())).setTarget(eventTaskParams.getTarget()).addAllStateGroups(eventTaskParams.getStateGroups());
        Intrinsics.checkNotNullExpressionValue(addAllStateGroups, "newBuilder()\n        .se…lStateGroups(stateGroups)");
        Object value = eventTaskParams.getValue();
        if (value != null) {
            addAllStateGroups.setValue(value.toString());
        }
        Rendering.Phase.Event.Task build = addAllStateGroups.build();
        Intrinsics.checkNotNullExpressionValue(build, "taskBuilder.build()");
        return build;
    }

    public static final Rendering.Phase.Event.EventName a(EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "<this>");
        switch (a.$EnumSwitchMapping$0[eventType.ordinal()]) {
            case 1:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_IMPRESSION;
            case 2:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_BILLABLE_IMPRESSION;
            case 3:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK;
            case 4:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_MUTE;
            case 5:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_UNMUTE;
            case 6:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_PAUSE;
            case 7:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_RESUME;
            case 8:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_SKIP;
            case 9:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLOSE;
            case 10:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_START;
            case 11:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_FIRST_QUARTILE;
            case 12:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_MIDPOINT;
            case 13:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_THIRD_QUARTILE;
            case 14:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_COMPLETE;
            case 15:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_PROGRESS;
            case 16:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_USE_CUSTOM_CLOSE;
            case 17:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_SCHEDULED;
            case 18:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_NAVIGATE;
            case 19:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_EXPAND;
            case 20:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_COLLAPSE;
            case 21:
                return Rendering.Phase.Event.EventName.EVENT_NAME_ON_CLICK_RESOLVED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Rendering.Phase.Event.Task.TaskName a(EventTaskType eventTaskType) {
        Intrinsics.checkNotNullParameter(eventTaskType, "<this>");
        switch (a.$EnumSwitchMapping$1[eventTaskType.ordinal()]) {
            case 1:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_TRACK;
            case 2:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_OPEN;
            case 3:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_NOTIFY_OPEN;
            case 4:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SKIP;
            case 5:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_CLOSE;
            case 6:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_MUTE;
            case 7:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNMUTE;
            case 8:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPEAT;
            case 9:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SHOW;
            case 10:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_HIDE;
            case 11:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_PROGRESS;
            case 12:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SCHEDULE;
            case 13:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_START;
            case 14:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_LOCK_VISIBILITY;
            case 15:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_UNLOCK_VISIBILITY;
            case 16:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_SIMULATE_CLICK;
            case 17:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_PRIVACY_SHEET;
            case 18:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_TOGGLE_STATE_GROUPS;
            case 19:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_EXPAND;
            case 20:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_COLLAPSE;
            case 21:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_REQUEST_PERMISSION;
            case 22:
                return Rendering.Phase.Event.Task.TaskName.TASK_NAME_REPORT_CLICK;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((EventTaskParams) it.next()));
        }
        return arrayList;
    }
}
