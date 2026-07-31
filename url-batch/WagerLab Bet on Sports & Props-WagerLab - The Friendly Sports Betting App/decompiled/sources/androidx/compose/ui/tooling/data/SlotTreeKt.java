package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.LocationSourceInformation;
import androidx.compose.runtime.tooling.ParameterSourceInformation;
import androidx.compose.runtime.tooling.SourceInformation;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.GraphRequest;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: SlotTree.jvm.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\t\u001a\u00020\n*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0003\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001aK\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\u0004\b\u0000\u0010\u0011*\u00020\u00122&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016*\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007\u001a\f\u0010\u001c\u001a\u00020\n*\u00020\u0012H\u0007\u001a\u0014\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010!H\u0003\u001a(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00162\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0003\u001a2\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00162\u0006\u0010.\u001a\u00020!2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0016H\u0002\u001a2\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00162\u0006\u0010.\u001a\u00020!2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0016H\u0002\u001a:\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020!2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\b\u0010/\u001a\u0004\u0018\u000100H\u0003\u001a)\u00108\u001a\b\u0012\u0004\u0012\u00020-0\u00162\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-092\u0006\u0010:\u001a\u00020;H\u0002¢\u0006\u0002\u0010<\u001a\u001a\u0010F\u001a\u0004\u0018\u00010-*\u0006\u0012\u0002\b\u00030G2\u0006\u0010H\u001a\u00020\u0007H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\"\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u000205X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u000205X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u000205X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u000205X\u0082T¢\u0006\u0002\n\u0000\" \u0010A\u001a\u0004\u0018\u00010\u0007*\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"emptyBox", "Landroidx/compose/ui/unit/IntRect;", "getEmptyBox", "()Landroidx/compose/ui/unit/IntRect;", "sourceInformationContextOf", "Landroidx/compose/ui/tooling/data/SourceInformationContext;", TtmlNode.TAG_INFORMATION, "", "parent", "getGroup", "Landroidx/compose/ui/tooling/data/Group;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "parentContext", "boundsOfLayoutNode", "node", "Landroidx/compose/ui/layout/LayoutInfo;", "mapTree", "T", "Landroidx/compose/runtime/tooling/CompositionData;", "factory", "Lkotlin/Function3;", "Landroidx/compose/ui/tooling/data/SourceContext;", "", "cache", "Landroidx/compose/ui/tooling/data/ContextCache;", "(Landroidx/compose/runtime/tooling/CompositionData;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/tooling/data/ContextCache;)Ljava/lang/Object;", "findParameters", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "asTree", "union", "other", "keyPosition", "key", "", "parameterPrefix", "internalFieldPrefix", "defaultFieldName", "changedFieldName", "jacocoDataField", "recomposeScopeNameSuffix", "extractParameterInfo", "data", "context", "extractFromIndyLambdaFields", GraphRequest.FIELDS_PARAM, "Ljava/lang/reflect/Field;", "block", TtmlNode.TAG_METADATA, "Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "extractFromLegacyFields", "buildParameterInfo", "field", FirebaseAnalytics.Param.INDEX, "", "defaults", "changed", "filterParameterFields", "", "isIndyLambda", "", "([Ljava/lang/reflect/Field;Z)Ljava/util/List;", "BITS_PER_SLOT", "SLOT_MASK", "STATIC_BITS", "STABLE_BITS", ViewProps.POSITION, "getPosition$annotations", "(Landroidx/compose/ui/tooling/data/Group;)V", "getPosition", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "accessibleField", "Ljava/lang/Class;", "name", "ui-tooling-data"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlotTreeKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOT_MASK = 7;
    private static final int STABLE_BITS = 4;
    private static final int STATIC_BITS = 3;
    private static final String changedFieldName = "$$changed";
    private static final String defaultFieldName = "$$default";
    private static final IntRect emptyBox = new IntRect(0, 0, 0, 0);
    private static final String internalFieldPrefix = "$$";
    private static final String jacocoDataField = "$jacoco";
    private static final String parameterPrefix = "$";
    private static final String recomposeScopeNameSuffix = ".RecomposeScopeImpl";

    public static /* synthetic */ void getPosition$annotations(Group group) {
    }

    public static final IntRect getEmptyBox() {
        return emptyBox;
    }

    static /* synthetic */ SourceInformationContext sourceInformationContextOf$default(String str, SourceInformationContext sourceInformationContext, int i, Object obj) {
        if ((i & 2) != 0) {
            sourceInformationContext = null;
        }
        return sourceInformationContextOf(str, sourceInformationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SourceInformationContext sourceInformationContextOf(String str, SourceInformationContext sourceInformationContext) {
        String str2;
        Iterator<LocationSourceInformation> it;
        int i;
        int i2;
        SourceInformation parseSourceInformation = SourceInformationKt.parseSourceInformation(str);
        Integer num = null;
        if (parseSourceInformation == null) {
            return null;
        }
        String functionName = parseSourceInformation.getFunctionName();
        String sourceFile = parseSourceInformation.getSourceFile();
        if (sourceFile == null) {
            if (sourceInformationContext == null) {
                str2 = null;
                if (parseSourceInformation.getSourceFile() == null) {
                    String packageHash = parseSourceInformation.getPackageHash();
                    if (packageHash != null) {
                        num = StringsKt.toIntOrNull(packageHash, 36);
                    }
                } else if (sourceInformationContext != null) {
                    num = Integer.valueOf(sourceInformationContext.getPackageHash());
                }
                int intValue = num == null ? num.intValue() : -1;
                List<LocationSourceInformation> locations = parseSourceInformation.getLocations();
                it = parseSourceInformation.getLocations().iterator();
                i = 0;
                while (true) {
                    if (it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (it.next().getIsRepeatable()) {
                        i2 = i;
                        break;
                    }
                    i++;
                }
                return new SourceInformationContext(functionName, str2, intValue, locations, i2, parseSourceInformation.getParameters(), parseSourceInformation.getIsCall(), parseSourceInformation.getIsInline());
            }
            sourceFile = sourceInformationContext.getSourceFile();
        }
        str2 = sourceFile;
        if (parseSourceInformation.getSourceFile() == null) {
        }
        if (num == null) {
        }
        List<LocationSourceInformation> locations2 = parseSourceInformation.getLocations();
        it = parseSourceInformation.getLocations().iterator();
        i = 0;
        while (true) {
            if (it.hasNext()) {
            }
            i++;
        }
        return new SourceInformationContext(functionName, str2, intValue, locations2, i2, parseSourceInformation.getParameters(), parseSourceInformation.getIsCall(), parseSourceInformation.getIsInline());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Group getGroup(CompositionGroup compositionGroup, SourceInformationContext sourceInformationContext) {
        SourceInformationContext sourceInformationContext2;
        SourceLocation sourceLocation;
        List<ModifierInfo> emptyList;
        IntRect intRect;
        Object obj;
        String str;
        ArrayList arrayList;
        List<ParameterInformation> list;
        Object key = compositionGroup.getKey();
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo != null) {
            sourceInformationContext2 = sourceInformationContextOf(sourceInfo, sourceInformationContext);
            sourceLocation = null;
        } else {
            sourceInformationContext2 = null;
            sourceLocation = null;
        }
        Object node = compositionGroup.getNode();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList2;
        CollectionsKt.addAll(arrayList4, compositionGroup.getData());
        Iterator<CompositionGroup> it = compositionGroup.getCompositionGroups().iterator();
        while (it.hasNext()) {
            arrayList3.add(getGroup(it.next(), sourceInformationContext2));
        }
        boolean z = node instanceof LayoutInfo;
        if (z) {
            emptyList = ((LayoutInfo) node).getModifierInfo();
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        if (z) {
            intRect = boundsOfLayoutNode((LayoutInfo) node);
        } else if (arrayList3.isEmpty()) {
            intRect = emptyBox;
        } else {
            ArrayList arrayList5 = arrayList3;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                arrayList6.add(((Group) it2.next()).getBox());
            }
            Iterator it3 = arrayList6.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = union((IntRect) it3.next(), (IntRect) next);
            }
            intRect = (IntRect) next;
        }
        boolean z2 = true;
        SourceLocation nextSourceLocation = (sourceInformationContext2 == null || !sourceInformationContext2.getIsCall() || sourceInformationContext == null) ? sourceLocation : sourceInformationContext.nextSourceLocation();
        if (node != null) {
            return new NodeGroup(key, node, intRect, arrayList4, emptyList, arrayList3);
        }
        Object obj2 = sourceLocation;
        IntRect intRect2 = intRect;
        SourceInformationContext sourceInformationContext3 = sourceInformationContext2;
        Object name = sourceInformationContext3 != null ? sourceInformationContext3.getName() : obj2;
        CharSequence charSequence = (CharSequence) (sourceInformationContext3 != null ? sourceInformationContext3.getName() : obj2);
        if (charSequence != null && charSequence.length() != 0 && (intRect2.getBottom() - intRect2.getTop() > 0 || intRect2.getRight() - intRect2.getLeft() > 0)) {
            obj2 = compositionGroup.getIdentity();
        }
        List<ParameterInformation> extractParameterInfo = extractParameterInfo(arrayList2, sourceInformationContext3);
        ArrayList arrayList7 = arrayList3;
        if (sourceInformationContext3 == null || !sourceInformationContext3.getIsInline()) {
            obj = obj2;
            str = name;
            arrayList = arrayList7;
            list = extractParameterInfo;
            z2 = false;
        } else {
            obj = obj2;
            str = name;
            arrayList = arrayList7;
            list = extractParameterInfo;
        }
        return new CallGroup(key, str, intRect2, nextSourceLocation, obj, list, arrayList4, arrayList, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect boundsOfLayoutNode(LayoutInfo layoutInfo) {
        LayoutCoordinates coordinates = layoutInfo.getCoordinates();
        if (!layoutInfo.isAttached() || !coordinates.isAttached()) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(coordinates);
        long mo7083getSizeYbymL2g = coordinates.mo7083getSizeYbymL2g();
        int roundToInt = MathKt.roundToInt(Float.intBitsToFloat((int) (positionInWindow >> 32)));
        int roundToInt2 = MathKt.roundToInt(Float.intBitsToFloat((int) (positionInWindow & 4294967295L)));
        return new IntRect(roundToInt, roundToInt2, ((int) (mo7083getSizeYbymL2g >> 32)) + roundToInt, ((int) (mo7083getSizeYbymL2g & 4294967295L)) + roundToInt2);
    }

    public static /* synthetic */ Object mapTree$default(CompositionData compositionData, Function3 function3, ContextCache contextCache, int i, Object obj) {
        if ((i & 2) != 0) {
            contextCache = new ContextCache();
        }
        return mapTree(compositionData, function3, contextCache);
    }

    public static final <T> T mapTree(CompositionData compositionData, Function3<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> function3, ContextCache contextCache) {
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.firstOrNull(compositionData.getCompositionGroups());
        if (compositionGroup == null) {
            return null;
        }
        CompositionCallStack compositionCallStack = new CompositionCallStack(function3, contextCache.getContexts$ui_tooling_data());
        ArrayList arrayList = new ArrayList();
        compositionCallStack.convert(compositionGroup, 0, arrayList);
        return (T) CollectionsKt.firstOrNull((List) arrayList);
    }

    public static /* synthetic */ List findParameters$default(CompositionGroup compositionGroup, ContextCache contextCache, int i, Object obj) {
        if ((i & 1) != 0) {
            contextCache = null;
        }
        return findParameters(compositionGroup, contextCache);
    }

    public static final List<ParameterInformation> findParameters(CompositionGroup compositionGroup, ContextCache contextCache) {
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo == null) {
            return CollectionsKt.emptyList();
        }
        SourceInformationContext sourceInformationContext = null;
        if (contextCache == null) {
            sourceInformationContext = sourceInformationContextOf$default(sourceInfo, null, 2, null);
        } else {
            Map<String, Object> contexts$ui_tooling_data = contextCache.getContexts$ui_tooling_data();
            Object obj = contexts$ui_tooling_data.get(sourceInfo);
            if (obj == null) {
                obj = sourceInformationContextOf$default(sourceInfo, null, 2, null);
                contexts$ui_tooling_data.put(sourceInfo, obj);
            }
            if (obj instanceof SourceInformationContext) {
                sourceInformationContext = (SourceInformationContext) obj;
            }
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, compositionGroup.getData());
        return extractParameterInfo(arrayList, sourceInformationContext);
    }

    public static final Group asTree(CompositionData compositionData) {
        Group group;
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.firstOrNull(compositionData.getCompositionGroups());
        return (compositionGroup == null || (group = getGroup(compositionGroup, null)) == null) ? EmptyGroup.INSTANCE : group;
    }

    public static final IntRect union(IntRect intRect, IntRect intRect2) {
        IntRect intRect3 = emptyBox;
        if (Intrinsics.areEqual(intRect, intRect3)) {
            return intRect2;
        }
        if (Intrinsics.areEqual(intRect2, intRect3)) {
            return intRect;
        }
        return new IntRect(Math.min(intRect.getLeft(), intRect2.getLeft()), Math.min(intRect.getTop(), intRect2.getTop()), Math.max(intRect.getRight(), intRect2.getRight()), Math.max(intRect.getBottom(), intRect2.getBottom()));
    }

    private static final String keyPosition(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof JoinedKey)) {
            return null;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        String keyPosition = keyPosition(joinedKey.getLeft());
        return keyPosition == null ? keyPosition(joinedKey.getRight()) : keyPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ParameterInformation> extractParameterInfo(List<? extends Object> list, SourceInformationContext sourceInformationContext) {
        Object obj;
        Object obj2;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj != null && StringsKt.endsWith$default(obj.getClass().getName(), recomposeScopeNameSuffix, false, 2, (Object) null)) {
                break;
            }
        }
        if (obj == null) {
            return CollectionsKt.emptyList();
        }
        Field accessibleField = accessibleField(obj.getClass(), "block");
        if (accessibleField == null || (obj2 = accessibleField.get(obj)) == null) {
            return CollectionsKt.emptyList();
        }
        List<ParameterSourceInformation> parameters = sourceInformationContext != null ? sourceInformationContext.getParameters() : null;
        if (parameters == null) {
            parameters = CollectionsKt.emptyList();
        }
        Class<?> cls = obj2.getClass();
        try {
            List<Field> filterParameterFields = filterParameterFields(cls.getDeclaredFields(), true);
            if (!filterParameterFields.isEmpty()) {
                return extractFromIndyLambdaFields(filterParameterFields, obj2, parameters);
            }
            return extractFromLegacyFields(filterParameterFields(cls.getDeclaredFields(), false), obj2, parameters);
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<ParameterInformation> extractFromIndyLambdaFields(List<Field> list, Object obj, List<ParameterSourceInformation> list2) {
        boolean z;
        int intValue;
        int intValue2;
        ArrayList arrayList;
        Iterator it;
        int i;
        Object obj2;
        List sortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractFromIndyLambdaFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Integer intOrNull = StringsKt.toIntOrNull(StringsKt.substringAfter$default(((Field) t).getName(), "f$", (String) null, 2, (Object) null));
                Integer valueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : Integer.MAX_VALUE);
                Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.substringAfter$default(((Field) t2).getName(), "f$", (String) null, 2, (Object) null));
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : Integer.MAX_VALUE));
            }
        });
        int i2 = 0;
        if (!list2.isEmpty()) {
            List<ParameterSourceInformation> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((ParameterSourceInformation) it2.next()).getName() != null) {
                    }
                }
            }
            z = false;
            List take = !z ? CollectionsKt.take(sortedWith, list2.size()) : sortedWith;
            int size = !z ? list2.size() : sortedWith.size();
            Field field = (Field) CollectionsKt.getOrNull(sortedWith, size);
            Object obj3 = field == null ? field.get(obj) : null;
            Integer num = !(obj3 instanceof Integer) ? (Integer) obj3 : null;
            intValue = num == null ? num.intValue() : 0;
            Field field2 = (Field) CollectionsKt.getOrNull(sortedWith, size + 1);
            Object obj4 = field2 == null ? field2.get(obj) : null;
            Integer num2 = !(obj4 instanceof Integer) ? (Integer) obj4 : null;
            intValue2 = num2 == null ? num2.intValue() : 0;
            List list4 = take;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            it = list4.iterator();
            while (true) {
                i = i2;
                if (!it.hasNext()) {
                    Object next = it.next();
                    i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Field field3 = (Field) next;
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (((ParameterSourceInformation) obj2).getSortedIndex() == i) {
                            break;
                        }
                    }
                    Object obj5 = obj;
                    arrayList.add(buildParameterInfo(field3, obj5, i, intValue2, intValue, (ParameterSourceInformation) obj2));
                    obj = obj5;
                } else {
                    return arrayList;
                }
            }
        }
        z = true;
        if (!z) {
        }
        if (!z) {
        }
        Field field4 = (Field) CollectionsKt.getOrNull(sortedWith, size);
        if (field4 == null) {
        }
        if (!(obj3 instanceof Integer)) {
        }
        if (num == null) {
        }
        Field field22 = (Field) CollectionsKt.getOrNull(sortedWith, size + 1);
        if (field22 == null) {
        }
        if (!(obj4 instanceof Integer)) {
        }
        if (num2 == null) {
        }
        List list42 = take;
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list42, 10));
        it = list42.iterator();
        while (true) {
            i = i2;
            if (!it.hasNext()) {
            }
            Object obj52 = obj;
            arrayList.add(buildParameterInfo(field3, obj52, i, intValue2, intValue, (ParameterSourceInformation) obj2));
            obj = obj52;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<ParameterInformation> extractFromLegacyFields(List<Field> list, Object obj, List<ParameterSourceInformation> list2) {
        List<ParameterSourceInformation> sortedWith;
        int i;
        ParameterInformation buildParameterInfo;
        Object obj2 = obj;
        Class<?> cls = obj2.getClass();
        Field accessibleField = accessibleField(cls, defaultFieldName);
        Object obj3 = accessibleField != null ? accessibleField.get(obj2) : null;
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        int intValue = num != null ? num.intValue() : 0;
        Field accessibleField2 = accessibleField(cls, changedFieldName);
        Object obj4 = accessibleField2 != null ? accessibleField2.get(obj2) : null;
        Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        if (!list2.isEmpty()) {
            List<ParameterSourceInformation> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (((ParameterSourceInformation) it.next()).getName() != null) {
                    }
                }
            }
            sortedWith = list2;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj5 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ParameterSourceInformation parameterSourceInformation = (ParameterSourceInformation) CollectionsKt.getOrNull(sortedWith, i2);
                ParameterSourceInformation parameterSourceInformation2 = parameterSourceInformation == null ? new ParameterSourceInformation(i2, null, null, 6, null) : parameterSourceInformation;
                int sortedIndex = parameterSourceInformation2.getSortedIndex();
                if (sortedIndex >= list.size()) {
                    i = intValue;
                    buildParameterInfo = null;
                } else {
                    i = intValue;
                    buildParameterInfo = buildParameterInfo(list.get(sortedIndex), obj2, i2, i, intValue2, parameterSourceInformation2);
                }
                if (buildParameterInfo != null) {
                    arrayList.add(buildParameterInfo);
                }
                obj2 = obj;
                intValue = i;
                i2 = i3;
            }
            return arrayList;
        }
        sortedWith = CollectionsKt.sortedWith(list2, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractFromLegacyFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((ParameterSourceInformation) t).getName(), ((ParameterSourceInformation) t2).getName());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        int i22 = 0;
        while (r10.hasNext()) {
        }
        return arrayList2;
    }

    private static final ParameterInformation buildParameterInfo(Field field, Object obj, int i, int i2, int i3, ParameterSourceInformation parameterSourceInformation) {
        String substring;
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        boolean z = ((1 << i) & i2) != 0;
        int i4 = (i * 3) + 1;
        int i5 = (i3 & (7 << i4)) >> i4;
        int i6 = i5 & 3;
        boolean z2 = i6 == 3;
        boolean z3 = i6 == 0;
        boolean z4 = (i5 & 4) == 0;
        if (parameterSourceInformation == null || (substring = parameterSourceInformation.getName()) == null) {
            substring = field.getName().substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        return new ParameterInformation(substring, obj2, z, z2, z3 && !z, parameterSourceInformation != null ? parameterSourceInformation.getInlineClass() : null, z4);
    }

    public static final String getPosition(Group group) {
        return keyPosition(group.getKey());
    }

    private static final Field accessibleField(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (Intrinsics.areEqual(field.getName(), str)) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    private static final List<Field> filterParameterFields(Field[] fieldArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            String name = field.getName();
            boolean matches = new Regex("^f\\$\\d+$").matches(name);
            boolean startsWith$default = StringsKt.startsWith$default(name, parameterPrefix, false, 2, (Object) null);
            if (((z && matches) || (!z && startsWith$default)) && !StringsKt.startsWith$default(name, internalFieldPrefix, false, 2, (Object) null) && !StringsKt.startsWith$default(name, jacocoDataField, false, 2, (Object) null)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }
}
