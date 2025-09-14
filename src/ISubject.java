public interface ISubject {
     void addWatcher(IWatcher watcher);
     void notifyAllWatchers(double rate);

}
