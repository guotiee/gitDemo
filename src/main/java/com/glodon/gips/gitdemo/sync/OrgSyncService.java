package com.glodon.gips.gitdemo.sync;

import java.util.List;

/**
 * The Request Context holds request, response,  state information and data for ZuulFilters to access and share.
 * The RequestContext lives for the duration of the request and is ThreadLocal.
 * extensions of RequestContext can be substituted by setting the contextClass.
 * Most methods here are convenience wrapper methods; the RequestContext is an extension of a ConcurrentHashMap
 *
 * @author Mikey Cohen
 * Date: 10/13/11
 * Time: 10:21 AM
 */
public interface OrgSyncService {
    List<String> getDiffer(List<String> list1, List<String> list2);
}
