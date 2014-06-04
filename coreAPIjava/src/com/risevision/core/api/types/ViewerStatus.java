package com.risevision.core.api.types;

public final class ViewerStatus {
	
	public static final int OK = 0;
	public static final int NO_COOKIE = 1;
	public static final int ID_SHARING_VIOLATION = 2;
	@Deprecated
	public static final int UPDATE_INTERVAL_VIOLATION = 3;
	public static final int DISPLAY_NOT_FOUND = 4;
	public static final int COMPANY_NOT_FOUND = 5;
	public static final int BLOCKED = 6;
	public static final int CONTENT_NOT_FOUND = 7;
	
	public static final int NO_CHANGES = -1;

}
