package com.sugarcrm.sugarcrm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-02-29T17:35:38.072+01:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.sugarcrm.com/sugarcrm", name = "sugarsoapPortType")
@XmlSeeAlso({ObjectFactory.class, org.xmlsoap.schemas.wsdl.ObjectFactory.class, org.xmlsoap.schemas.soap.encoding.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SugarsoapPortType {

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "set_note_attachment", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/set_note_attachment")
    public NewSetEntryResult setNoteAttachment(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "note", name = "note")
        NewNoteAttachment note
    );

    @WebMethod(action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/logout")
    public void logout(
        @WebParam(partName = "session", name = "session")
        java.lang.String session
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_user_id", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_user_id")
    public java.lang.String getUserId(
        @WebParam(partName = "session", name = "session")
        java.lang.String session
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "set_relationships", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/set_relationships")
    public NewSetRelationshipListResult setRelationships(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_names", name = "module_names")
        SelectFields moduleNames,
        @WebParam(partName = "module_ids", name = "module_ids")
        SelectFields moduleIds,
        @WebParam(partName = "link_field_names", name = "link_field_names")
        SelectFields linkFieldNames,
        @WebParam(partName = "related_ids", name = "related_ids")
        NewSetRelationhipIds relatedIds,
        @WebParam(partName = "name_value_lists", name = "name_value_lists")
        NameValueLists nameValueLists,
        @WebParam(partName = "delete_array", name = "delete_array")
        DeletedArray deleteArray
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "set_entry", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/set_entry")
    public NewSetEntryResult setEntry(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "name_value_list", name = "name_value_list")
        NameValueList nameValueList
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_available_modules", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_available_modules")
    public ModuleList getAvailableModules(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "filter", name = "filter")
        java.lang.String filter
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/login")
    public EntryValue login(
        @WebParam(partName = "user_auth", name = "user_auth")
        UserAuth userAuth,
        @WebParam(partName = "application_name", name = "application_name")
        java.lang.String applicationName,
        @WebParam(partName = "name_value_list", name = "name_value_list")
        NameValueList nameValueList
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_document_revision", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_document_revision")
    public NewReturnDocumentRevision getDocumentRevision(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "i", name = "i")
        java.lang.String i
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_user_team_id", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_user_team_id")
    public java.lang.String getUserTeamId(
        @WebParam(partName = "session", name = "session")
        java.lang.String session
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_entries_count", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_entries_count")
    public GetEntriesCountResult getEntriesCount(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "query", name = "query")
        java.lang.String query,
        @WebParam(partName = "deleted", name = "deleted")
        int deleted
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_module_fields", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_module_fields")
    public NewModuleFields getModuleFields(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "fields", name = "fields")
        SelectFields fields
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "set_relationship", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/set_relationship")
    public NewSetRelationshipListResult setRelationship(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "module_id", name = "module_id")
        java.lang.String moduleId,
        @WebParam(partName = "link_field_name", name = "link_field_name")
        java.lang.String linkFieldName,
        @WebParam(partName = "related_ids", name = "related_ids")
        SelectFields relatedIds,
        @WebParam(partName = "name_value_list", name = "name_value_list")
        NameValueList nameValueList,
        @WebParam(partName = "delete", name = "delete")
        int delete
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_last_viewed", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_last_viewed")
    public LastViewedList getLastViewed(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_names", name = "module_names")
        ModuleNames moduleNames
    );

    @WebMethod(operationName = "set_campaign_merge", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/set_campaign_merge")
    public void setCampaignMerge(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "targets", name = "targets")
        SelectFields targets,
        @WebParam(partName = "campaign_id", name = "campaign_id")
        java.lang.String campaignId
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "search_by_module", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/search_by_module")
    public ReturnSearchResult searchByModule(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "search_string", name = "search_string")
        java.lang.String searchString,
        @WebParam(partName = "modules", name = "modules")
        SelectFields modules,
        @WebParam(partName = "offset", name = "offset")
        int offset,
        @WebParam(partName = "max_results", name = "max_results")
        int maxResults,
        @WebParam(partName = "assigned_user_id", name = "assigned_user_id")
        java.lang.String assignedUserId,
        @WebParam(partName = "select_fields", name = "select_fields")
        SelectFields selectFields,
        @WebParam(partName = "unified_search_only", name = "unified_search_only")
        boolean unifiedSearchOnly,
        @WebParam(partName = "favorites", name = "favorites")
        boolean favorites
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_server_info", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_server_info")
    public GetServerInfoResult getServerInfo();

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_module_fields_md5", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_module_fields_md5")
    public Md5Results getModuleFieldsMd5(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_names", name = "module_names")
        SelectFields moduleNames
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "set_document_revision", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/set_document_revision")
    public NewSetEntryResult setDocumentRevision(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "note", name = "note")
        DocumentRevision note
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "set_entries", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/set_entries")
    public NewSetEntriesResult setEntries(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "name_value_lists", name = "name_value_lists")
        NameValueLists nameValueLists
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_entry_list", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_entry_list")
    public GetEntryListResultVersion2 getEntryList(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "query", name = "query")
        java.lang.String query,
        @WebParam(partName = "order_by", name = "order_by")
        java.lang.String orderBy,
        @WebParam(partName = "offset", name = "offset")
        int offset,
        @WebParam(partName = "select_fields", name = "select_fields")
        SelectFields selectFields,
        @WebParam(partName = "link_name_to_fields_array", name = "link_name_to_fields_array")
        LinkNamesToFieldsArray linkNameToFieldsArray,
        @WebParam(partName = "max_results", name = "max_results")
        int maxResults,
        @WebParam(partName = "deleted", name = "deleted")
        int deleted,
        @WebParam(partName = "favorites", name = "favorites")
        boolean favorites
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_upcoming_activities", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_upcoming_activities")
    public UpcomingActivitiesList getUpcomingActivities(
        @WebParam(partName = "session", name = "session")
        java.lang.String session
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_relationships", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_relationships")
    public GetEntryResultVersion2 getRelationships(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "module_id", name = "module_id")
        java.lang.String moduleId,
        @WebParam(partName = "link_field_name", name = "link_field_name")
        java.lang.String linkFieldName,
        @WebParam(partName = "related_module_query", name = "related_module_query")
        java.lang.String relatedModuleQuery,
        @WebParam(partName = "related_fields", name = "related_fields")
        SelectFields relatedFields,
        @WebParam(partName = "related_module_link_name_to_fields_array", name = "related_module_link_name_to_fields_array")
        LinkNamesToFieldsArray relatedModuleLinkNameToFieldsArray,
        @WebParam(partName = "deleted", name = "deleted")
        int deleted,
        @WebParam(partName = "order_by", name = "order_by")
        java.lang.String orderBy
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_note_attachment", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_note_attachment")
    public NewReturnNoteAttachment getNoteAttachment(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "id", name = "id")
        java.lang.String id
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_entry", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_entry")
    public GetEntryResultVersion2 getEntry(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "id", name = "id")
        java.lang.String id,
        @WebParam(partName = "select_fields", name = "select_fields")
        SelectFields selectFields,
        @WebParam(partName = "link_name_to_fields_array", name = "link_name_to_fields_array")
        LinkNamesToFieldsArray linkNameToFieldsArray,
        @WebParam(partName = "track_view", name = "track_view")
        boolean trackView
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "get_entries", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/get_entries")
    public GetEntryResultVersion2 getEntries(
        @WebParam(partName = "session", name = "session")
        java.lang.String session,
        @WebParam(partName = "module_name", name = "module_name")
        java.lang.String moduleName,
        @WebParam(partName = "ids", name = "ids")
        SelectFields ids,
        @WebParam(partName = "select_fields", name = "select_fields")
        SelectFields selectFields,
        @WebParam(partName = "link_name_to_fields_array", name = "link_name_to_fields_array")
        LinkNamesToFieldsArray linkNameToFieldsArray,
        @WebParam(partName = "track_view", name = "track_view")
        boolean trackView
    );

    @WebResult(name = "return", targetNamespace = "http://www.sugarcrm.com/sugarcrm", partName = "return")
    @WebMethod(operationName = "seamless_login", action = "http://localhost/SugarCE-Full-6.4.0/service/v4/soap.php/seamless_login")
    public int seamlessLogin(
        @WebParam(partName = "session", name = "session")
        java.lang.String session
    );
}
