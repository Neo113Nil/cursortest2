package com.luckycounter.drinkwater.data;

import F1.l;
import S0.g;
import S0.n;
import V0.i;
import Z0.d;
import a1.EnumC0064a;
import android.content.Context;
import c1.AbstractC0104b;
import i1.f;
import java.time.LocalDate;
import java.util.List;

/* loaded from: classes.dex */
public final class HydrationRepository {
    private final WaterDao dao;
    private final UserPreferences prefs;

    public HydrationRepository(Context context) {
        f.e(context, "context");
        this.dao = AppDatabase.Companion.getInstance(context).waterDao();
        this.prefs = new UserPreferences(context);
    }

    private final LocalDate getToday() {
        LocalDate now = LocalDate.now();
        f.d(now, "now(...)");
        return now;
    }

    private final int percentOf(int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int i3 = (int) ((i / i2) * 100.0f);
        if (i3 > 100) {
            return 100;
        }
        return i3;
    }

    private final void updateStreakOnGoalMet() {
        String localDate = getToday().toString();
        f.d(localDate, "toString(...)");
        String lastGoalDate = this.prefs.getLastGoalDate();
        if (f.a(lastGoalDate, localDate)) {
            return;
        }
        String localDate2 = getToday().minusDays(1L).toString();
        f.d(localDate2, "toString(...)");
        this.prefs.setStreakDays(f.a(lastGoalDate, localDate2) ? 1 + this.prefs.getStreakDays() : 1);
        this.prefs.setLastGoalDate(localDate);
    }

    public final Object deleteEntry(WaterEntry waterEntry, d dVar) {
        Object delete = this.dao.delete(waterEntry, dVar);
        return delete == EnumC0064a.f1630a ? delete : i.f1250a;
    }

    public final int getDailyGoal() {
        List list = g.f1080a;
        n a2 = g.a(this.prefs.getStreakDays());
        return this.prefs.getCustomGoalEnabled() ? AbstractC0104b.h(this.prefs.getDailyGoalMl(), 500, a2.f1095e) : a2.d;
    }

    public final int getMaxGoalForCurrentTier() {
        List list = g.f1080a;
        return g.a(this.prefs.getStreakDays()).f1095e;
    }

    public final int getStreakDays() {
        return this.prefs.getStreakDays();
    }

    public final int getTierIndex() {
        List list = g.f1080a;
        return g.a(this.prefs.getStreakDays()).f1092a;
    }

    public final Object getTodayEntries(d dVar) {
        V0.d dayBounds$default = UserPreferencesKt.dayBounds$default(getToday(), null, 2, null);
        return this.dao.getEntriesForDay(((Number) dayBounds$default.f1243a).longValue(), ((Number) dayBounds$default.f1244b).longValue(), dVar);
    }

    public final Object getTodayTotal(d dVar) {
        V0.d dayBounds$default = UserPreferencesKt.dayBounds$default(getToday(), null, 2, null);
        return this.dao.sumForDay(((Number) dayBounds$default.f1243a).longValue(), ((Number) dayBounds$default.f1244b).longValue(), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logWater(int i, d dVar) {
        HydrationRepository$logWater$1 hydrationRepository$logWater$1;
        int i2;
        HydrationRepository hydrationRepository;
        HydrationRepository hydrationRepository2;
        HydrationRepository hydrationRepository3;
        int intValue;
        int dailyGoal;
        if (dVar instanceof HydrationRepository$logWater$1) {
            hydrationRepository$logWater$1 = (HydrationRepository$logWater$1) dVar;
            int i3 = hydrationRepository$logWater$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hydrationRepository$logWater$1.label = i3 - Integer.MIN_VALUE;
                Object obj = hydrationRepository$logWater$1.result;
                EnumC0064a enumC0064a = EnumC0064a.f1630a;
                i2 = hydrationRepository$logWater$1.label;
                boolean z2 = true;
                if (i2 != 0) {
                    l.n0(obj);
                    if (i <= 0) {
                        hydrationRepository$logWater$1.L$0 = this;
                        hydrationRepository$logWater$1.label = 1;
                        obj = getTodayTotal(hydrationRepository$logWater$1);
                        if (obj == enumC0064a) {
                            return enumC0064a;
                        }
                        hydrationRepository2 = this;
                        int intValue2 = ((Number) obj).intValue();
                        int dailyGoal2 = hydrationRepository2.getDailyGoal();
                        return new LogResult(intValue2, dailyGoal2, hydrationRepository2.percentOf(intValue2, dailyGoal2), false, hydrationRepository2.getTierIndex());
                    }
                    WaterDao waterDao = this.dao;
                    WaterEntry waterEntry = new WaterEntry(0L, i, System.currentTimeMillis(), 1, null);
                    hydrationRepository$logWater$1.L$0 = this;
                    hydrationRepository$logWater$1.label = 2;
                    if (waterDao.insert(waterEntry, hydrationRepository$logWater$1) == enumC0064a) {
                        return enumC0064a;
                    }
                    hydrationRepository = this;
                    hydrationRepository$logWater$1.L$0 = hydrationRepository;
                    hydrationRepository$logWater$1.label = 3;
                    obj = hydrationRepository.getTodayTotal(hydrationRepository$logWater$1);
                    if (obj != enumC0064a) {
                    }
                } else {
                    if (i2 == 1) {
                        hydrationRepository2 = (HydrationRepository) hydrationRepository$logWater$1.L$0;
                        l.n0(obj);
                        int intValue22 = ((Number) obj).intValue();
                        int dailyGoal22 = hydrationRepository2.getDailyGoal();
                        return new LogResult(intValue22, dailyGoal22, hydrationRepository2.percentOf(intValue22, dailyGoal22), false, hydrationRepository2.getTierIndex());
                    }
                    if (i2 == 2) {
                        hydrationRepository = (HydrationRepository) hydrationRepository$logWater$1.L$0;
                        l.n0(obj);
                        hydrationRepository$logWater$1.L$0 = hydrationRepository;
                        hydrationRepository$logWater$1.label = 3;
                        obj = hydrationRepository.getTodayTotal(hydrationRepository$logWater$1);
                        if (obj != enumC0064a) {
                            return enumC0064a;
                        }
                        hydrationRepository3 = hydrationRepository;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hydrationRepository3 = (HydrationRepository) hydrationRepository$logWater$1.L$0;
                        l.n0(obj);
                    }
                }
                intValue = ((Number) obj).intValue();
                dailyGoal = hydrationRepository3.getDailyGoal();
                int percentOf = hydrationRepository3.percentOf(intValue, dailyGoal);
                if (intValue >= dailyGoal) {
                    hydrationRepository3.updateStreakOnGoalMet();
                    String localDate = hydrationRepository3.getToday().toString();
                    f.d(localDate, "toString(...)");
                    if (!f.a(hydrationRepository3.prefs.getLastCelebrateDate(), localDate)) {
                        hydrationRepository3.prefs.setLastCelebrateDate(localDate);
                        return new LogResult(intValue, dailyGoal, percentOf, z2, hydrationRepository3.getTierIndex());
                    }
                }
                z2 = false;
                return new LogResult(intValue, dailyGoal, percentOf, z2, hydrationRepository3.getTierIndex());
            }
        }
        hydrationRepository$logWater$1 = new HydrationRepository$logWater$1(this, dVar);
        Object obj2 = hydrationRepository$logWater$1.result;
        EnumC0064a enumC0064a2 = EnumC0064a.f1630a;
        i2 = hydrationRepository$logWater$1.label;
        boolean z22 = true;
        if (i2 != 0) {
        }
        intValue = ((Number) obj2).intValue();
        dailyGoal = hydrationRepository3.getDailyGoal();
        int percentOf2 = hydrationRepository3.percentOf(intValue, dailyGoal);
        if (intValue >= dailyGoal) {
        }
        z22 = false;
        return new LogResult(intValue, dailyGoal, percentOf2, z22, hydrationRepository3.getTierIndex());
    }

    public final void resetStreak() {
        this.prefs.resetStreak();
    }

    public final void setDailyGoal(int i) {
        this.prefs.setCustomGoalEnabled(true);
        this.prefs.setDailyGoalMl(AbstractC0104b.h(i, 500, getMaxGoalForCurrentTier()));
    }
}
