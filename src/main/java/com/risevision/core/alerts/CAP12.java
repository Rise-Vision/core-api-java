package com.risevision.core.alerts;

public final class CAP12 {
	
	public final static String STATUS_ACTUAL = "Actual";
	public final static String STATUS_EXERCISE = "Exercise";
	public final static String STATUS_SYSTEM = "System";
	public final static String STATUS_TEST = "Test";
	public final static String STATUS_DRAFT = "Draft";
	
	public final static String TYPE_ALERT = "Alert";
	public final static String TYPE_UPDATE = "Update";
	public final static String TYPE_CANCEL = "Cancel";
	public final static String TYPE_ACK = "Ack";
	public final static String TYPE_ERROR = "Error";
	
	
	public final static String CATEGORY_GEOPHYSICAL = "Geo";
	public final static String CATEGORY_METEOROLOGICAL = "Met";
	public final static String CATEGORY_SAFETY = "Safety";
	public final static String CATEGORY_SECURITY = "Security";
	public final static String CATEGORY_RESCUE = "Rescue";
	public final static String CATEGORY_FIRE = "Fire";
	public final static String CATEGORY_HEALTH = "Health";
	public final static String CATEGORY_ENVIRONMENTAL = "Env";
	public final static String CATEGORY_TRANSPORT = "Transport";
	public final static String CATEGORY_INFRASTRUCTURAL = "Infra";
	public final static String CATEGORY_CBRNE = "CBRNE";
	public final static String CATEGORY_OTHER = "Other";
	
	public final static String URGENCY_IMMEDIATE = "Immediate";
	public final static String URGENCY_EXPECTED = "Expected";
	public final static String URGENCY_FUTURE = "Future";
	public final static String URGENCY_PAST = "Past";
	public final static String URGENCY_UNKNOWN = "Unknown";
	
	public final static String SEVERITY_EXTREME = "Extreme";
	public final static String SEVERITY_SEVERE = "Severe";
	public final static String SEVERITY_MODERATE = "Moderate";
	public final static String SEVERITY_MINOR = "Minor";
	public final static String SEVERITY_UNKNOWN = "Unknown";
	
	public final static String CERTAINTY_OBSERVED = "Observed";
	public final static String CERTAINTY_LIKELY = "Likely";
	public final static String CERTAINTY_POSSIBLE = "Possible";
	public final static String CERTAINTY_UNLIKELY = "Unlikely";
	public final static String CERTAINTY_UNKNOWN = "Unknown";
	
	public final static String CERTAINTY_VERY_LIKELY = "Very Likely"; // deprecated, for backward compatibility with CAP 1.0 should be treated as equivalent to “Likely”
	
	public final static String TEXT_HEADLINE = "headline";
	public final static String TEXT_DESCRIPTION = "description";
	public final static String TEXT_INSTRUCTION = "instruction";

}
