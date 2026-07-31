package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.type.ObjectUpdate;

/* loaded from: classes7.dex */
public class LiveCounterUpdate extends ObjectUpdate {
    public LiveCounterUpdate() {
        super(null);
    }

    public LiveCounterUpdate(Double d) {
        super(new Update(d));
    }

    public Update getUpdate() {
        return (Update) this.update;
    }

    public String toString() {
        if (this.update == null) {
            return "LiveCounterUpdate{no change}";
        }
        return "LiveCounterUpdate{amount=" + getUpdate().getAmount() + "}";
    }

    public static class Update {
        private final Double amount;

        public Update(Double d) {
            this.amount = d;
        }

        public Double getAmount() {
            return this.amount;
        }
    }
}
