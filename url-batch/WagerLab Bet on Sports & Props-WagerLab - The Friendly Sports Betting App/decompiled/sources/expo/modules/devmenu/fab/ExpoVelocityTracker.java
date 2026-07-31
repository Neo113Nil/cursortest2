package expo.modules.devmenu.fab;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpoVelocityTracker.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\nH\u0002J\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lexpo/modules/devmenu/fab/ExpoVelocityTracker;", "", "timeFrameMillis", "", "<init>", "(J)V", "positions", "Ljava/util/LinkedList;", "Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PositionSnapshot;", "registerPosition", "", "x", "", "y", "calculateVelocity", "Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PointF;", "pruneOldPositions", "clear", "PointF", "PositionSnapshot", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExpoVelocityTracker {
    public static final int $stable = 8;
    private final LinkedList<PositionSnapshot> positions;
    private final long timeFrameMillis;

    public ExpoVelocityTracker() {
        this(0L, 1, null);
    }

    /* compiled from: ExpoVelocityTracker.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PointF;", "", "x", "", "y", "<init>", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PointF {
        public static final int $stable = 0;
        private final float x;
        private final float y;

        public static /* synthetic */ PointF copy$default(PointF pointF, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = pointF.x;
            }
            if ((i & 2) != 0) {
                f2 = pointF.y;
            }
            return pointF.copy(f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public final PointF copy(float x, float y) {
            return new PointF(x, y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointF)) {
                return false;
            }
            PointF pointF = (PointF) other;
            return Float.compare(this.x, pointF.x) == 0 && Float.compare(this.y, pointF.y) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        public String toString() {
            return "PointF(x=" + this.x + ", y=" + this.y + ")";
        }

        public PointF(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }
    }

    public ExpoVelocityTracker(long j) {
        this.timeFrameMillis = j;
        this.positions = new LinkedList<>();
    }

    public /* synthetic */ ExpoVelocityTracker(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 100L : j);
    }

    /* compiled from: ExpoVelocityTracker.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PositionSnapshot;", "", "point", "Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PointF;", "timestamp", "", "<init>", "(Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PointF;J)V", "getPoint", "()Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PointF;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class PositionSnapshot {
        private final PointF point;
        private final long timestamp;

        public static /* synthetic */ PositionSnapshot copy$default(PositionSnapshot positionSnapshot, PointF pointF, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                pointF = positionSnapshot.point;
            }
            if ((i & 2) != 0) {
                j = positionSnapshot.timestamp;
            }
            return positionSnapshot.copy(pointF, j);
        }

        /* renamed from: component1, reason: from getter */
        public final PointF getPoint() {
            return this.point;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final PositionSnapshot copy(PointF point, long timestamp) {
            Intrinsics.checkNotNullParameter(point, "point");
            return new PositionSnapshot(point, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionSnapshot)) {
                return false;
            }
            PositionSnapshot positionSnapshot = (PositionSnapshot) other;
            return Intrinsics.areEqual(this.point, positionSnapshot.point) && this.timestamp == positionSnapshot.timestamp;
        }

        public int hashCode() {
            return (this.point.hashCode() * 31) + Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "PositionSnapshot(point=" + this.point + ", timestamp=" + this.timestamp + ")";
        }

        public PositionSnapshot(PointF point, long j) {
            Intrinsics.checkNotNullParameter(point, "point");
            this.point = point;
            this.timestamp = j;
        }

        public final PointF getPoint() {
            return this.point;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }
    }

    public final void registerPosition(float x, float y) {
        this.positions.add(new PositionSnapshot(new PointF(x, y), System.currentTimeMillis()));
        pruneOldPositions();
    }

    public final PointF calculateVelocity() {
        pruneOldPositions();
        if (this.positions.size() < 2) {
            return new PointF(0.0f, 0.0f);
        }
        PositionSnapshot positionSnapshot = (PositionSnapshot) CollectionsKt.first((List) this.positions);
        PositionSnapshot positionSnapshot2 = (PositionSnapshot) CollectionsKt.last((List) this.positions);
        float timestamp = (positionSnapshot2.getTimestamp() - positionSnapshot.getTimestamp()) / 1000.0f;
        if (timestamp == 0.0f) {
            return new PointF(0.0f, 0.0f);
        }
        return new PointF((positionSnapshot2.getPoint().getX() - positionSnapshot.getPoint().getX()) / timestamp, (positionSnapshot2.getPoint().getY() - positionSnapshot.getPoint().getY()) / timestamp);
    }

    private final void pruneOldPositions() {
        long currentTimeMillis = System.currentTimeMillis() - this.timeFrameMillis;
        while (!this.positions.isEmpty() && ((PositionSnapshot) CollectionsKt.first((List) this.positions)).getTimestamp() < currentTimeMillis) {
            this.positions.pollFirst();
        }
    }

    public final void clear() {
        this.positions.clear();
    }
}
