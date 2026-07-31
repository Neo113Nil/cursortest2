package com.smaato.sdk.ng.models;

import com.smaato.sdk.ng.models.bidstream.Signal;
import com.smaato.sdk.ng.utils.json.JsonModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public class AdRequest extends JsonModel {
    public String appToken;
    public Boolean isInterstitial = Boolean.FALSE;
    private final List<Signal> signals = new CopyOnWriteArrayList();
    public List<Topic> topics;
    public String zoneId;

    public void addSignal(Signal signal) {
        this.signals.add(signal);
    }

    public List<Signal> getSignals() {
        return this.signals;
    }
}
