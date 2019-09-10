package br.com.rodartenogueira.zkspringmodelo;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import br.com.rodartenogueira.zkspringmodelo.database.TenantContext;

public class MultitenantDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return TenantContext.getCurrentTenant();
    }
}