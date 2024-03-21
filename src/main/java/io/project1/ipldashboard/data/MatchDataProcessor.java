package  io.project1.ipldashboard.data;
    import org.slf4j.Logger;

    import org.slf4j.LoggerFactory;
    
    import org.springframework.batch.item.ItemProcessor;

    import io.project1.ipldashboard.model.Match;
    public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {
        private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);
        @Override
        public Match process(final MatchInput matchInput) throws Exception {
            Match match = new Match();
            match.setId(matchInput.getId());

            return match;
        }
    }   
