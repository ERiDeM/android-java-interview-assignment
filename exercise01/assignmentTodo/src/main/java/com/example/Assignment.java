package com.example;

public class Assignment {

    /**
     * Save the result of the latest command executed
     */
    private String mLastResult;

    //region Getters and Setters

    public String getLastResult() {
        if (mLastResult == null) {
            mLastResult = "";
        }
        return mLastResult;
    }

    private void setLastResult(String lastResult) {
        if (lastResult == null) {
            mLastResult = "";
        } else {
            mLastResult = lastResult;
        }
    }

    //endregion

    public Assignment() {}

    /**
     * Run a command
     * @param text is the command to execute
     * @return the current instance in case we want to concat more operations
     */
    public Assignment execComm(String text) {
        if (text != null) {
            text = text.trim();
            String result = runCommand(text);
            setLastResult(result);
        } else {
            setLastResult(null);
        }
        return this;
    }

    /**
     * Clean the last result
     */
    public void clean() {
        setLastResult(null);
    }

    /**
     * METHOD TO IMPLEMENT ON THIS ASSIGNMENT.
     * TAKE YOUR OWN DECISIONS AND DISCUSS WITH YOUR INTERVIEWER.
     * @param text is the command to execute
     * @return the result of the command to execute
     */
    private String runCommand(String text) {
        /*
         * WE NEED TO FILL THIS GAP!
         */

        return "2";
    }


}
