package br.com.rodartenogueira.zkspringmodelo.database;

public class TenantContext {

    private static ThreadLocal<String> tenantSchema = new ThreadLocal<>();

    public static String getTenantSchema() {
        return tenantSchema.get();
    }

    public static void setTenantSchema(String uuid) {
        tenantSchema.set(uuid);
    }
    
    private static ThreadLocal<Object> currentTenant = new ThreadLocal<>();

    public static void setCurrentTenant(Object tenant) {
        currentTenant.set(tenant);
    }

    public static Object getCurrentTenant() {
        return currentTenant.get();
    }
}

