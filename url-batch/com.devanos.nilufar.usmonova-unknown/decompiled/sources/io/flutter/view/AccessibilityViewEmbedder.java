package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C0878d1;
import o.C0943e1;

@Keep
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final C0878d1 reflectionAccessors = new C0878d1();
    private final SparseArray<C0943e1> flutterIdToOrigin = new SparseArray<>();
    private final Map<C0943e1, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l;
        int i;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            C0878d1 c0878d1 = this.reflectionAccessors;
            Method method = c0878d1.f;
            Field field = c0878d1.e;
            Method method2 = c0878d1.d;
            if (method2 != null || (field != null && method != null)) {
                if (method2 != null) {
                    try {
                        l = (Long) method2.invoke(accessibilityNodeInfo, Integer.valueOf(i2));
                    } catch (IllegalAccessException e) {
                        Log.w(TAG, "Failed to access getChildId method.", e);
                    } catch (InvocationTargetException e2) {
                        Log.w(TAG, "The getChildId method threw an exception when invoked.", e2);
                    }
                } else {
                    try {
                        l = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i2));
                        l.getClass();
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        e = e3;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l = null;
                        if (l == null) {
                        }
                    } catch (IllegalAccessException e4) {
                        Log.w(TAG, "Failed to access longArrayGetIndex method or the childNodeId field.", e4);
                    } catch (InvocationTargetException e5) {
                        e = e5;
                        Log.w(TAG, "The longArrayGetIndex method threw an exception when invoked.", e);
                        l = null;
                        if (l == null) {
                        }
                    }
                }
                if (l == null) {
                    int longValue = (int) (l.longValue() >> 32);
                    C0943e1 c0943e1 = new C0943e1(view, longValue);
                    if (this.originToFlutterId.containsKey(c0943e1)) {
                        i = this.originToFlutterId.get(c0943e1).intValue();
                    } else {
                        int i3 = this.nextFlutterId;
                        this.nextFlutterId = i3 + 1;
                        cacheVirtualIdMappings(view, longValue, i3);
                        i = i3;
                    }
                    accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
                }
            }
            l = null;
            if (l == null) {
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i2) {
        C0943e1 c0943e1 = new C0943e1(view, i);
        this.originToFlutterId.put(c0943e1, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, c0943e1);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        List availableExtraData;
        CharSequence hintText;
        boolean isShowingHintText;
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (Build.VERSION.SDK_INT >= 26) {
            availableExtraData = accessibilityNodeInfo.getAvailableExtraData();
            accessibilityNodeInfo2.setAvailableExtraData(availableExtraData);
            hintText = accessibilityNodeInfo.getHintText();
            accessibilityNodeInfo2.setHintText(hintText);
            isShowingHintText = accessibilityNodeInfo.isShowingHintText();
            accessibilityNodeInfo2.setShowingHintText(isShowingHintText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l;
        Method method = this.reflectionAccessors.b;
        if (method != null) {
            try {
                l = (Long) method.invoke(accessibilityNodeInfo, null);
                l.getClass();
            } catch (IllegalAccessException e) {
                Log.w(TAG, "Failed to access getParentNodeId method.", e);
            } catch (InvocationTargetException e2) {
                Log.w(TAG, "The getParentNodeId method threw an exception when invoked.", e2);
            }
            if (l != null) {
                return;
            }
            Integer num = this.originToFlutterId.get(new C0943e1(view, (int) (l.longValue() >> 32)));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            Log.w(TAG, "Unexpected Android version. Unable to find the parent ID.");
        } else {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (C0878d1.b(readLong, 0)) {
                obtain2.readInt();
            }
            if (C0878d1.b(readLong, 1)) {
                obtain2.readLong();
            }
            if (C0878d1.b(readLong, 2)) {
                obtain2.readInt();
            }
            r1 = C0878d1.b(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
        }
        l = r1;
        if (l != null) {
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        C0943e1 c0943e1 = this.flutterIdToOrigin.get(i);
        if (c0943e1 == null) {
            return null;
        }
        View view = c0943e1.a;
        if (!this.embeddedViewToDisplayBounds.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(c0943e1.b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a = C0878d1.a(this.reflectionAccessors, accessibilityRecord);
        if (a == null) {
            return null;
        }
        return this.originToFlutterId.get(new C0943e1(view, (int) (a.longValue() >> 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        Long l;
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.a;
        if (method != null) {
            try {
                l = (Long) method.invoke(createAccessibilityNodeInfo, null);
            } catch (IllegalAccessException e) {
                Log.w(TAG, "Failed to access getSourceNodeId method.", e);
            } catch (InvocationTargetException e2) {
                Log.w(TAG, "The getSourceNodeId method threw an exception when invoked.", e2);
            }
            if (l != null) {
                return null;
            }
            this.embeddedViewToDisplayBounds.put(view, rect);
            cacheVirtualIdMappings(view, (int) (l.longValue() >> 32), i);
            return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
        }
        l = null;
        if (l != null) {
        }
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        C0943e1 c0943e1 = this.flutterIdToOrigin.get(i);
        if (c0943e1 == null) {
            return false;
        }
        View view = c0943e1.a;
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i2] = pointerProperties;
            motionEvent.getPointerProperties(i2, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        C0943e1 c0943e1 = this.flutterIdToOrigin.get(i);
        if (c0943e1 == null || (accessibilityNodeProvider = c0943e1.a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(c0943e1.b, i2, bundle);
    }

    public View platformViewOfNode(int i) {
        C0943e1 c0943e1 = this.flutterIdToOrigin.get(i);
        if (c0943e1 == null) {
            return null;
        }
        return c0943e1.a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a = C0878d1.a(this.reflectionAccessors, accessibilityEvent);
        if (a != null) {
            int longValue = (int) (a.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new C0943e1(view, longValue));
            if (num == null) {
                int i = this.nextFlutterId;
                this.nextFlutterId = i + 1;
                Integer valueOf = Integer.valueOf(i);
                cacheVirtualIdMappings(view, longValue, i);
                num = valueOf;
            }
            obtain.setSource(this.rootAccessibilityView, num.intValue());
            obtain.setClassName(accessibilityEvent.getClassName());
            obtain.setPackageName(accessibilityEvent.getPackageName());
            for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
                AccessibilityRecord record = obtain.getRecord(i2);
                Long a2 = C0878d1.a(this.reflectionAccessors, record);
                if (a2 != null) {
                    C0943e1 c0943e1 = new C0943e1(view, (int) (a2.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(c0943e1)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(c0943e1).intValue());
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
        }
        return false;
    }
}
