package boxconnector.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BoxDateFormat {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	
	/**
     * Parses a date string returned by the Box API into a {@link Date} object.
     * @param  dateString     a string containing the date.
     * @return                the parsed date.
     * @throws ParseException if the string cannot be parsed into a valid date.
     */
    public static Date parse(String dateString) throws ParseException {
    	return sdf.parse(fixIso8601TimeZone(dateString));
    }
    
    /**
     * Parses a date string returned by the Box API into a {@link Date} object.
     * @param  dateString     a string containing the date.
     * @return                the parsed date.
     * @throws ParseException if the string cannot be parsed into a valid date.
     */
    public static Date parseZdate(String dateString) throws ParseException {
    	return sdf.parse(fixTimeZone(dateString));
    }
    
    /**
     * Formats a date as a string that can be sent to the Box API.
     * @param  date the date to format.
     * @return      a string containing the formatted date.
     */
    public static String format(Date date) {
    	return sdf.format(date);
    }

	/**
     * Helper function to handle ISO 8601 strings of the following format:
     * "2008-03-01T13:00:00+01:00".  Note that the final colon (":") in the
     * time zone is not supported by SimpleDateFormat's "Z" token.
     *
     * @param dateString a string containing the date.
     * @return a date string that matches the date format.
     */
	private static String fixIso8601TimeZone(String dateString) {
        if (dateString.length() >= 24 && dateString.charAt(22) == ':') {
            return dateString.substring(0, 22) + dateString.substring(23);
        }
        return dateString;
    }
	
	/**
     * Helper function to handle strings of the following format:
     * "2016-07-22T00:00:00.000Z".
     *
     * @param dateString a string containing the date.
     * @return a date string that matches the date format.
     */
	private static String fixTimeZone(String dateString) {
        if (dateString.length() >= 24 && dateString.charAt(19) == '.' && dateString.charAt(23) == 'Z') {
        	return dateString.substring(0, 19) + '+' + dateString.substring(20,23) + '0';
        } else if (dateString.length() < 24 && dateString.endsWith("Z") ) {
        	return dateString.substring(0, dateString.length()-1) + "+0000";
        }
        return dateString;
    }
	
	/**
     * Helper function to handle RFC3339 strings of the following format:
     * "014-05-15T13:35:01-07:00Z".
     *
     * @param date a date to format.
     * @return a date string that matches the date format.
     */
	public static String formatRFC3339(Date date) {
		return sdf.format(date).replaceAll("\\+(\\d\\d)(\\d\\d)$", "-$1:$2") + "Z";
    }
}
