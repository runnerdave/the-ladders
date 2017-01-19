package net.runnerdave.domain;

/**
 * Created by davidajimenez on 20/01/2017.
 */
public enum JobType {
    JReq{
        public boolean requiresResume() {
            return true;
        }
    }, ATS;
    public boolean requiresResume() {
        return false;
    }
}
