package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class MraidCalendarEvent {
    private final String a;
    private final Date b;
    private String c;
    private String d;
    private Date e;
    private String f;
    private String g;
    private String h;

    MraidCalendarEvent(String str, Date date) {
        this.a = str;
        this.b = date;
    }

    void a(String str) {
        this.c = str;
    }

    void b(String str) {
        this.h = str;
    }

    void c(String str) {
        this.f = str;
    }

    void d(String str) {
        this.d = str;
    }

    void e(String str) {
        this.g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MraidCalendarEvent)) {
            return false;
        }
        MraidCalendarEvent mraidCalendarEvent = (MraidCalendarEvent) obj;
        return Objects.equals(this.a, mraidCalendarEvent.a) && Objects.equals(this.b, mraidCalendarEvent.b) && Objects.equals(this.c, mraidCalendarEvent.c) && Objects.equals(this.d, mraidCalendarEvent.d) && Objects.equals(this.e, mraidCalendarEvent.e) && Objects.equals(this.f, mraidCalendarEvent.f) && Objects.equals(this.g, mraidCalendarEvent.g) && Objects.equals(this.h, mraidCalendarEvent.h);
    }

    @NonNull
    public String getDescription() {
        return this.a;
    }

    @Nullable
    public Date getEnd() {
        return this.e;
    }

    @Nullable
    public String getLocation() {
        return this.c;
    }

    @Nullable
    public String getRecurrence() {
        return this.h;
    }

    @NonNull
    public Date getStart() {
        return this.b;
    }

    @Nullable
    public String getStatus() {
        return this.f;
    }

    @Nullable
    public String getSummary() {
        return this.d;
    }

    @Nullable
    public String getTransparency() {
        return this.g;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @NonNull
    public String toString() {
        return "MraidCalendarEvent{description='" + this.a + "', start=" + this.b + ", location='" + this.c + "', summary='" + this.d + "', end=" + this.e + ", status='" + this.f + "', transparency='" + this.g + "', recurrence='" + this.h + "'}";
    }

    void a(Date date) {
        this.e = date;
    }
}
