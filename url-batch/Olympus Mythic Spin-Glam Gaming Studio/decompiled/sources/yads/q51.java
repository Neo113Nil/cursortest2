package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlinx.serialization.json.Json;

/* loaded from: classes14.dex */
public final class q51 {
    public final Json a;

    public q51(Json json) {
        this.a = json;
    }

    public final String a(y80 y80Var) {
        Json json = this.a;
        Json.Default.getSerializersModule();
        String a = cm.a(json.encodeToString(y80.Companion.serializer(), y80Var));
        if (a == null) {
            a = "";
        }
        List plus = CollectionsKt.plus(new CharRange('A', 'Z'), new CharRange('a', 'z'));
        IntRange intRange = new IntRange(1, 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            Character ch = (Character) CollectionsKt.random(plus, Random.Default);
            ch.getClass();
            arrayList.add(ch);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null) + a;
    }
}
