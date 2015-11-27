package com.example.helpers;

import com.example.Main;

public class Assignment {

    /**
     * Main class for the assignment
     */
    private Main mMain;

    /**
     * Save the result of the latest command executed
     */
    private String mLastResult;

    //region Getters and Setters

    protected Main getMain() {
        if (mMain == null) {
            mMain = new Main();
        }
        return mMain;
    }

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
            String result = getMain().runCommand(text);
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
}
