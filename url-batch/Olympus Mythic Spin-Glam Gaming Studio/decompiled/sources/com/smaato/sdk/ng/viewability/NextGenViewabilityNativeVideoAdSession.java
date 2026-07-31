package com.smaato.sdk.ng.viewability;

import android.view.View;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.viewability.baseom.BaseVerificationScriptResource;
import com.smaato.sdk.ng.viewability.baseom.BaseViewabilityManager;
import com.smaato.sdk.ng.viewability.baseom.MediaEventType;
import java.util.List;

/* loaded from: classes10.dex */
public class NextGenViewabilityNativeVideoAdSession extends NextGenViewabilityAdSession {
    private static final String n = "NextGenViewabilityNativeVideoAdSession";
    private Object f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final Integer m;

    public NextGenViewabilityNativeVideoAdSession(BaseViewabilityManager baseViewabilityManager, Integer num) {
        super(baseViewabilityManager);
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = true;
        this.m = num;
    }

    private boolean a() {
        BaseViewabilityManager baseViewabilityManager = this.d;
        return baseViewabilityManager == null || !baseViewabilityManager.isViewabilityMeasurementEnabled();
    }

    protected void b() {
        Object obj;
        if (a() || (obj = this.a) == null) {
            return;
        }
        this.b = this.d.createAdEvents(obj);
    }

    protected void c() {
        Object obj;
        try {
            if (!a() && (obj = this.a) != null) {
                this.f = this.d.createMediaEvents(obj);
            }
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireBufferFinish() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.BUFFER_FINISH, obj);
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireBufferStart() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.BUFFER_START, obj);
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireClick() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.CLICK, obj);
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireComplete() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null || this.k) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.COMPLETE, obj);
            this.k = true;
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireFirstQuartile() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null || this.h) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.FIRST_QUARTILE, obj);
            this.h = true;
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    @Override // com.smaato.sdk.ng.viewability.NextGenViewabilityAdSession
    public void fireLoaded() {
        try {
            if (a()) {
                return;
            }
            Integer num = this.m;
            Object createVastPropertiesForNonSkippableMedia = (num == null || num.intValue() <= -1) ? this.d.createVastPropertiesForNonSkippableMedia() : this.d.createVastPropertiesForSkippableMedia(this.m);
            Object obj = this.b;
            if (obj != null) {
                this.d.fireEventProperties(obj, createVastPropertiesForNonSkippableMedia);
            }
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireMidpoint() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null || this.i) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.MIDPOINT, obj);
            this.i = true;
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void firePause() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.PAUSE, obj);
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireResume() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.RESUME, obj);
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireSkipped() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.SKIPPED, obj);
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireStart(float f, boolean z) {
        Object obj;
        try {
            if (a() || (obj = this.f) == null || this.g) {
                return;
            }
            this.d.fireMediaEventStart(obj, f, z ? 0.0f : 1.0f);
            this.g = true;
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireThirdQuartile() {
        Object obj;
        try {
            if (a() || (obj = this.f) == null || this.j) {
                return;
            }
            this.d.fireMediaEvents(MediaEventType.THIRD_QUARTILE, obj);
            this.j = true;
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void fireVolumeChange(boolean z) {
        try {
            if (!a() && z != this.l) {
                this.l = z;
                Object obj = this.f;
                if (obj == null || this.k) {
                    return;
                }
                this.d.fireMediaEventVolumeChange(obj, z ? 0.0f : 1.0f);
            }
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }

    public void initAdSession(View view, List<BaseVerificationScriptResource> list) {
        if (a()) {
            return;
        }
        this.c.addAll(list);
        try {
            Object createNativeAdSessionContext = this.d.createNativeAdSessionContext(this.c);
            Object createAdSession = this.d.createAdSession(this.d.getNativeAdSessionConfiguration(), createNativeAdSessionContext);
            this.a = createAdSession;
            this.d.registerAdView(createAdSession, view);
            b();
            c();
            this.d.startAdSession(this.a);
        } catch (Exception e) {
            Logger.e(n, "OM SDK Ad Session - Exception", e);
        }
    }
}
