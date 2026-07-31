package com.yandex.div.storage;

import android.os.SystemClock;
import androidx.annotation.AnyThread;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.ParsingException;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivDataRepositoryException;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import com.yandex.div.storage.templates.Template;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivDataRepositoryImpl.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0016\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u0015H\u0017J\b\u0010\u001e\u001a\u00020\u001cH\u0017J$\u0010\u001f\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0002J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0014H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0017J\u001c\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00110/H\u0017J\u0016\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0002J\u0018\u00104\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020%0\u0013H\u0002J2\u00105\u001a\u000e\u0012\u0004\u0012\u0002H6\u0012\u0004\u0012\u0002H70\u0013\"\u0004\b\u0000\u00106\"\u0004\b\u0001\u00107*\u0010\u0012\u0006\u0012\u0004\u0018\u0001H6\u0012\u0004\u0012\u0002H70\u0013H\u0002J&\u00108\u001a\u00020'*\u00020'2\u0006\u0010(\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u00010%H\u0002J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0015*\b\u0012\u0004\u0012\u00020=0\u0015H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/yandex/div/storage/DivDataRepositoryImpl;", "Lcom/yandex/div/storage/DivDataRepository;", "divStorage", "Lcom/yandex/div/storage/DivStorage;", "templateContainer", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "histogramRecorder", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "histogramNameProvider", "Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "divParsingHistogramProxy", "Ljavax/inject/Provider;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "cardErrorFactory", "Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;", "(Lcom/yandex/div/storage/DivStorage;Lcom/yandex/div/storage/templates/TemplatesContainer;Lcom/yandex/div/storage/histogram/HistogramRecorder;Lcom/yandex/div/storage/histogram/HistogramNameProvider;Ljavax/inject/Provider;Lcom/yandex/div/storage/analytics/CardErrorLoggerFactory;)V", "areCardsSynchronizedWithInMemory", "", "cardsWithErrors", "", "", "", "Lcom/yandex/div/storage/DivDataRepositoryException;", "inMemoryData", "", "Lcom/yandex/div/storage/DivDataRepository$DivDataWithMeta;", "generateUniqueId", "get", "Lcom/yandex/div/storage/DivDataRepositoryResult;", "ids", "getAll", "loadFromStorage", "", "idsToExclude", "parseRawDivData", "Lcom/yandex/div2/DivData;", "rawDivData", "Lorg/json/JSONObject;", "parsingEnvironment", "Lcom/yandex/div/data/DivParsingEnvironment;", "cardId", "put", "payload", "Lcom/yandex/div/storage/DivDataRepository$Payload;", "remove", "Lcom/yandex/div/storage/DivDataRepositoryRemoveResult;", "predicate", "Lkotlin/Function1;", "Lcom/yandex/div/storage/RawDataAndMetadata;", "removeFromInMemory", "", "deletedRecords", "asJSONObject", "filterKeysNotNull", "K", "V", "includeCardContext", NotificationCategory.GROUP_ID_KEY, "metadata", "toDivDataRepositoryExceptions", "Lcom/yandex/div/storage/DivDataRepositoryException$StorageException;", "Lcom/yandex/div/storage/database/StorageException;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DivDataRepositoryImpl implements DivDataRepository {
    private boolean areCardsSynchronizedWithInMemory;

    @NotNull
    private final CardErrorLoggerFactory cardErrorFactory;

    @NotNull
    private final Provider divParsingHistogramProxy;

    @NotNull
    private final DivStorage divStorage;

    @Nullable
    private final HistogramNameProvider histogramNameProvider;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    @NotNull
    private final TemplatesContainer templateContainer;

    @NotNull
    private final Map<String, DivDataRepository.DivDataWithMeta> inMemoryData = new LinkedHashMap();

    @NotNull
    private Map<String, ? extends List<? extends DivDataRepositoryException>> cardsWithErrors = MapsKt.emptyMap();

    public DivDataRepositoryImpl(@NotNull DivStorage divStorage, @NotNull TemplatesContainer templatesContainer, @NotNull HistogramRecorder histogramRecorder, @Nullable HistogramNameProvider histogramNameProvider, @NotNull Provider provider, @NotNull CardErrorLoggerFactory cardErrorLoggerFactory) {
        this.divStorage = divStorage;
        this.templateContainer = templatesContainer;
        this.histogramRecorder = histogramRecorder;
        this.histogramNameProvider = histogramNameProvider;
        this.divParsingHistogramProxy = provider;
        this.cardErrorFactory = cardErrorLoggerFactory;
    }

    @Override // com.yandex.div.storage.DivDataRepository
    @AnyThread
    @NotNull
    public DivDataRepositoryResult put(@NotNull DivDataRepository.Payload payload) {
        List<Template> emptyList;
        ArrayList arrayList = new ArrayList();
        String generateUniqueId = generateUniqueId();
        if (!payload.getTemplates().isEmpty()) {
            emptyList = this.templateContainer.addTemplates(generateUniqueId, asJSONObject(payload.getTemplates()), payload.getSourceType());
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<Template> list = emptyList;
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList<DivDataRepository.DivDataWithMeta> arrayList2 = new ArrayList(payload.getDivs().size());
        ArrayList arrayList3 = new ArrayList(payload.getDivs().size());
        for (RawDataAndMetadata rawDataAndMetadata : payload.getDivs()) {
            DivParsingEnvironment includeCardContext = includeCardContext(this.templateContainer.getEnvironment(generateUniqueId), rawDataAndMetadata.getId(), generateUniqueId, rawDataAndMetadata.getMetadata());
            try {
                DivData parseRawDivData = parseRawDivData(rawDataAndMetadata.getDivData(), includeCardContext, rawDataAndMetadata.getId());
                arrayList3.add(rawDataAndMetadata);
                arrayList2.add(new DivDataRepository.DivDataWithMeta(rawDataAndMetadata.getId(), parseRawDivData, rawDataAndMetadata.getMetadata()));
            } catch (ParsingException e) {
                includeCardContext.getLogger().logError(e);
                arrayList.add(new DivDataRepositoryException.JsonParsingException("Error parsing DivData", e, rawDataAndMetadata.getId()));
            }
        }
        if (UiThreadHandler.isMainThread()) {
            HistogramRecorder.reportDivDataLoadTime$default(this.histogramRecorder, SystemClock.uptimeMillis() - uptimeMillis, null, 2, null);
        }
        for (DivDataRepository.DivDataWithMeta divDataWithMeta : arrayList2) {
            this.inMemoryData.put(divDataWithMeta.getId(), divDataWithMeta);
        }
        arrayList.addAll(toDivDataRepositoryExceptions(this.divStorage.saveData(generateUniqueId, (arrayList3.size() == payload.getDivs().size() ? payload : DivDataRepository.Payload.copy$default(payload, arrayList3, null, null, null, 14, null)).getDivs(), list, payload.getActionOnError()).getErrors()));
        return new DivDataRepositoryResult(arrayList2, arrayList);
    }

    private final String generateUniqueId() {
        return "group-" + Calendar.getInstance().getTime().toString() + '-' + new Object().hashCode();
    }

    private final DivParsingEnvironment includeCardContext(DivParsingEnvironment divParsingEnvironment, String str, String str2, JSONObject jSONObject) {
        return new DivParsingEnvironment(this.cardErrorFactory.createContextualLogger(divParsingEnvironment.getLogger(), str, str2, jSONObject), divParsingEnvironment.getTemplates());
    }

    @Override // com.yandex.div.storage.DivDataRepository
    @AnyThread
    @NotNull
    public DivDataRepositoryResult getAll() {
        Pair pair;
        if (this.areCardsSynchronizedWithInMemory && this.cardsWithErrors.isEmpty()) {
            return new DivDataRepositoryResult(CollectionsKt.toList(this.inMemoryData.values()), CollectionsKt.emptyList());
        }
        if (this.areCardsSynchronizedWithInMemory) {
            pair = TuplesKt.to(this.cardsWithErrors.keySet(), SetsKt.emptySet());
        } else {
            pair = TuplesKt.to(SetsKt.emptySet(), SetsKt.minus((Set) this.inMemoryData.keySet(), (Iterable) this.cardsWithErrors.keySet()));
        }
        DivDataRepositoryResult loadFromStorage = loadFromStorage((Set) pair.component1(), (Set) pair.component2());
        DivDataRepositoryResult addData = loadFromStorage.addData(this.inMemoryData.values());
        for (DivDataRepository.DivDataWithMeta divDataWithMeta : loadFromStorage.getResultData()) {
            this.inMemoryData.put(divDataWithMeta.getId(), divDataWithMeta);
        }
        this.areCardsSynchronizedWithInMemory = true;
        List<DivDataRepositoryException> errors = loadFromStorage.getErrors();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : errors) {
            String cardId = ((DivDataRepositoryException) obj).getCardId();
            Object obj2 = linkedHashMap.get(cardId);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(cardId, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.cardsWithErrors = filterKeysNotNull(linkedHashMap);
        return addData;
    }

    private final <K, V> Map<K, V> filterKeysNotNull(Map<K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (key != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    @Override // com.yandex.div.storage.DivDataRepository
    @AnyThread
    @NotNull
    public DivDataRepositoryResult get(@NotNull List<String> ids) {
        if (ids.isEmpty()) {
            return DivDataRepositoryResult.INSTANCE.getEMPTY();
        }
        List<String> list = ids;
        Set<String> mutableSet = CollectionsKt.toMutableSet(list);
        ArrayList arrayList = new ArrayList(ids.size());
        for (String str : list) {
            DivDataRepository.DivDataWithMeta divDataWithMeta = this.inMemoryData.get(str);
            if (divDataWithMeta != null) {
                arrayList.add(divDataWithMeta);
                mutableSet.remove(str);
            }
        }
        if (!mutableSet.isEmpty()) {
            DivDataRepositoryResult loadFromStorage = loadFromStorage(mutableSet, SetsKt.emptySet());
            for (DivDataRepository.DivDataWithMeta divDataWithMeta2 : loadFromStorage.getResultData()) {
                this.inMemoryData.put(divDataWithMeta2.getId(), divDataWithMeta2);
            }
            return loadFromStorage.addData(arrayList);
        }
        return new DivDataRepositoryResult(arrayList, CollectionsKt.emptyList());
    }

    private final DivDataRepositoryResult loadFromStorage(Set<String> ids, Set<String> idsToExclude) {
        ArrayList arrayList = new ArrayList();
        DivStorage.LoadDataResult<DivStorage.RestoredRawData> loadData = this.divStorage.loadData(CollectionsKt.toList(ids), CollectionsKt.toList(idsToExclude));
        List<DivStorage.RestoredRawData> component1 = loadData.component1();
        arrayList.addAll(toDivDataRepositoryExceptions(loadData.component2()));
        List<DivStorage.RestoredRawData> list = component1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((DivStorage.RestoredRawData) obj).getGroupId$div_storage_release(), obj);
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.templateContainer.getEnvironment((String) it.next());
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList2 = new ArrayList(ids.size());
        for (DivStorage.RestoredRawData restoredRawData : list) {
            DivParsingEnvironment includeCardContext = includeCardContext(this.templateContainer.getEnvironment(restoredRawData.getGroupId$div_storage_release()), restoredRawData.getId(), restoredRawData.getGroupId$div_storage_release(), restoredRawData.getMetadata());
            try {
                arrayList2.add(new DivDataRepository.DivDataWithMeta(restoredRawData.getId(), parseRawDivData(restoredRawData.getDivData(), includeCardContext, restoredRawData.getId()), restoredRawData.getMetadata()));
            } catch (ParsingException e) {
                includeCardContext.getLogger().logError(e);
                arrayList.add(new DivDataRepositoryException.JsonParsingException("Error parsing DivData", e, restoredRawData.getId()));
            }
        }
        HistogramRecorder.reportDivDataLoadTime$default(this.histogramRecorder, SystemClock.uptimeMillis() - uptimeMillis, null, 2, null);
        return new DivDataRepositoryResult(arrayList2, arrayList);
    }

    @Override // com.yandex.div.storage.DivDataRepository
    @AnyThread
    @NotNull
    public DivDataRepositoryRemoveResult remove(@NotNull Function1 predicate) {
        DivStorage.RemoveResult remove = this.divStorage.remove(predicate);
        Set<String> component1 = remove.component1();
        List<DivDataRepositoryException.StorageException> divDataRepositoryExceptions = toDivDataRepositoryExceptions(remove.component2());
        removeFromInMemory(component1);
        return new DivDataRepositoryRemoveResult(component1, divDataRepositoryExceptions);
    }

    private final void removeFromInMemory(Set<String> deletedRecords) {
        Iterator<T> it = deletedRecords.iterator();
        while (it.hasNext()) {
            this.inMemoryData.remove((String) it.next());
        }
    }

    private final DivData parseRawDivData(JSONObject rawDivData, DivParsingEnvironment parsingEnvironment, String cardId) throws ParsingException {
        HistogramNameProvider histogramNameProvider = this.histogramNameProvider;
        return ((DivParsingHistogramProxy) this.divParsingHistogramProxy.get()).createDivData(parsingEnvironment, rawDivData, histogramNameProvider != null ? histogramNameProvider.getHistogramNameFromCardId(cardId) : null);
    }

    private final JSONObject asJSONObject(Map<String, ? extends JSONObject> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends JSONObject> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    private final List<DivDataRepositoryException.StorageException> toDivDataRepositoryExceptions(List<? extends StorageException> list) {
        List<? extends StorageException> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivDataRepositoryException.StorageException((StorageException) it.next()));
        }
        return arrayList;
    }
}
